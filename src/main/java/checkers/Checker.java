package checkers;

import person.Person;

/**Interface to find certain person
 * @see CheckerAge
 * @see CheckerDateOfBirth
 * @see CheckerFio
 * @author Mushchenko Ilya
 */
public interface Checker {
    /**
     *Method to compare a specific field in the Person class with the value of object
     * @param person person
     * @param object - field
     * @return true if field is equal to the object
     * or false otherwise
     */
    boolean check(Person person, Object object);
}
