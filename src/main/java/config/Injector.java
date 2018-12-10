package config;

import sorters.BubbleSort;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;

public class Injector {
    public static final String PATH_TO_PROPERTIES = "src/main/resources/config.properties";

    public void inject(Object rep) {
        FileInputStream fileInputStream;
        Properties prop = new Properties();
        try {
            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            prop.load(fileInputStream);
            Class<?> clazz = rep.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if(field.isAnnotationPresent(Inject.class)) {
                    if(prop.containsKey(field.getType().getName())) {
                        field.setAccessible(true);
                        field.set(rep, new BubbleSort());//prop.getProperty(field.getType().getName()));
                    }
                }

            }
        } catch (IOException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
