package checkers;

import person.Person;

public class CheckerDateOfBirth implements Checker{
    public boolean check(Person person, Object object) {
        return person.getDateOfBirth().equals(object);
    }
}
