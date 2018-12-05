package sorters;

import person.Person;
import repository.RepositoryForPerson;

import java.util.Comparator;

/**
 * Интерфейс для классов сортировки, который имеет один метод sort - собственно
 * он и выполняет сортиировку
 */
public interface Sorter {
    /**
     * Метод для сортировки
     * @param repository репозиторий, который мы хотим отсортировать
     * @param comparator компоратор, который будет сортировать по определенным параметрам
     * @see comparators.ComparatorAge
     * @see comparators.ComparatorDateOfBirth
     * @see comparators.ComparatorFio
     */
    void sort(RepositoryForPerson repository, Comparator<Person> comparator);
}
