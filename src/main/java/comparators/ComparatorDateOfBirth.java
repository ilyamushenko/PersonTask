package comparators;

import person.Person;

import java.util.Comparator;

/**
 * Класс, который сравнивает двух людей по дате рождения
 */
public class ComparatorDateOfBirth implements Comparator<Person> {
    /**
     * Метод, который сравниевает двух людей по дате рождения
     * @param o1  первый человек
     * @param o2  второй человек
     * @return значение. Если оно меньше 0, то o1 предшествует человеку o2 (o1 моложе o2)
     */
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}
