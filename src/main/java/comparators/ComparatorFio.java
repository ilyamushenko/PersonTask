package comparators;

import person.Person;

import java.util.Comparator;

/**
 * Класс, который сравнивает двух людей по ФИО
 */
public class ComparatorFio implements Comparator<Person> {
    /**
     * Метод, который сравниевает двух людей по дате рождения
     * @param o1  первый человек
     * @param o2  второй человек
     * @return значение. Если оно меньше 0, то o1 предшествует человеку o2 (Сравниваются по алфавиту)
     */
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getFio().compareTo(o2.getFio());
    }
}
