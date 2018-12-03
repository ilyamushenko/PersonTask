package sorters;

import person.Person;
import repository.RepositoryForPerson;

import java.util.Comparator;

public interface Sorter {
    void sort(RepositoryForPerson repository, Comparator<Person> comparator);
}
