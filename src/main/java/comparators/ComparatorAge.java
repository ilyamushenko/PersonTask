package comparators;

import org.apache.log4j.Logger;
import person.Person;

import java.util.Comparator;

/**
 * Class which compare two persons by age
 */
public class ComparatorAge implements Comparator<Person> {
    /**
     * Method which compare two persons by age (count of years)
     * @param o1  first person
     * @param o2  second person
     * @return value. if value < 0, then o1 preceded person o2 (o1 younger o2)
     */
    private static final Logger log = Logger.getLogger(ComparatorAge.class);

    @Override
    public int compare(Person o1, Person o2) {
        log.info("Compare age " + o1.getAge() + " and " + o2.getAge());
        return Integer.compare(o1.getAge(), o2.getAge());
    }

    @Override
    public String toString() {
        return "Comparator by age";
    }
}
