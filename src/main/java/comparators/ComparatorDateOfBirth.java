package comparators;

import person.Person;

import java.util.Comparator;

public class ComparatorDateOfBirth implements Comparator<Person> {

    public int compare(Person o1, Person o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}
