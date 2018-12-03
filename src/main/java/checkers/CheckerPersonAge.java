package checkers;

import person.Person;

public class CheckerPersonAge implements Checker {

    public boolean check(Person person, Object object) {
        return Integer.valueOf(person.getAge()).equals(object);
    }
}
