package comparators;

import org.apache.log4j.Logger;
import person.Person;

import java.util.Comparator;

/**
 * Class which compare two persons by date of birth
 */
public class ComparatorDateOfBirth implements Comparator<Person> {

    private static final Logger log = Logger.getLogger(ComparatorDateOfBirth.class);

    /**
     * Method which compare two persons by date of birth
     * @param o1  first person
     * @param o2  second person
     * @return value. if value < 0, then o1 preceded person o2
     */
    @Override
    public int compare(Person o1, Person o2) {
        log.info("Compare date of birth " + o1.getDateOfBirth() + " and " + o2.getDateOfBirth());

        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
    @Override
    public String toString() {
        return "Comparator by date of birth";
    }
}
