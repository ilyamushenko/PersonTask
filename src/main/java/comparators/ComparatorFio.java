package comparators;

import person.Person;

import java.util.Comparator;

public class ComparatorFio implements Comparator<Person> {

    public int compare(Person o1, Person o2) {
        return o1.getFio().compareTo(o2.getFio());
    }
}
