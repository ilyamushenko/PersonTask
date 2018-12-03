package checkers;

import person.Person;

public class CheckerFio implements Checker {
    public boolean check(Person person, Object fio) {
        return person.getFio().equals(fio);
    }
}
