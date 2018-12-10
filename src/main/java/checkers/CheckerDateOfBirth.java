package checkers;

import org.apache.log4j.Logger;
import person.Person;

/**
 * Class, which implements interface {@link Checker}
 * to find Person with certain date of birth
 */
public class CheckerDateOfBirth implements Checker{
    /**
     * Method to compare date of birth in the Person class with the value of object
     * @param person person
     * @param object - field
     * @return true if date of birth is equal to the object
     * or false otherwise
     */
    private static final Logger log = Logger.getLogger(CheckerDateOfBirth.class);

    public boolean check(Person person, Object object) {
        log.info("Compare date of birth " + person.getAge() + " and " + object);
        return person.getDateOfBirth().equals(object);
    }

    @Override
    public String toString() {
        return "Checker date of birth";
    }
}
