package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
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
                        //field.set(rep, new BubbleSort());//prop.getProperty(field.getType().getName()));
                        Class<?> instance = Class.forName(prop.getProperty(field.getType().getName()));
                        Constructor<?> constructor = instance.getConstructor();
                        Object sorter = constructor.newInstance();
                        field.set(rep, sorter);//prop.getProperty(field.getType().getName()));

                    }
                }

            }
        } catch (IOException | IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
