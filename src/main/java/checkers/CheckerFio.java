package checkers;

import org.apache.log4j.Logger;
import person.Person;

/**
 * Class, which implements interface {@link Checker}
 * to find Person with certain FIO
 */
public class CheckerFio implements Checker {
    /**
     * Method to compare FIO in the Person class with the value of object
     * @param person person
     * @param object - field
     * @return true if FIO is equal to the object
     * or false otherwise
     */
    private static final Logger log = Logger.getLogger(CheckerFio.class);

    public boolean check(Person person, Object object) {
        log.info("Compare FIO " + person.getAge() + " and " + object);
        return person.getFio().equals(object);
    }

    @Override
    public String toString() {
        return "Checker Fio";
    }
}
