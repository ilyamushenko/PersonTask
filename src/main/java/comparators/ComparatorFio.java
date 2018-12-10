package comparators;

import org.apache.log4j.Logger;
import person.Person;

import java.util.Comparator;

/**
 * Class which compare two persons by FIO
 */
public class ComparatorFio implements Comparator<Person> {
    /**
     * Method which compare two persons by FIO
     * @param o1  first person
     * @param o2  second person
     * @return value. if value < 0, then o1 preceded person o2
     */
    private static final Logger log = Logger.getLogger(ComparatorFio.class);

    @Override
    public int compare(Person o1, Person o2) {
        log.info("Compare FIO " + o1.getFio() + " and " + o2.getFio());
        return o1.getFio().compareTo(o2.getFio());
    }
    @Override
    public String toString() {
        return "Comparator by fio";
    }
}
