package comparators;

import person.Person;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
