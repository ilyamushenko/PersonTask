package checkers;

import org.apache.log4j.Logger;
import person.Person;

/**
 *Class, which implements interface {@link Checker}
 * to find Person with certain age
 */
public class CheckerAge implements Checker {
    /**
     * Method to compare age in the Person class with the value of object
     * @param person person
     * @param object - field
     * @return true if age is equal to the object
     * or false otherwise
     */
    private static final Logger log = Logger.getLogger(CheckerAge.class);
    public boolean check(Person person, Object object) {
        log.info("Compare age " + person.getAge() + " and " + object);
        return Integer.valueOf(person.getAge()).equals(object);
    }

    @Override
    public String toString() {
        return "Checker age";
    }
}
