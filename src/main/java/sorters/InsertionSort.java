package sorters;

import person.Person;
import repository.RepositoryForPerson;

import java.util.Comparator;

public class InsertionSort implements Sorter {
    @Override
    public void sort(RepositoryForPerson repository, Comparator<Person> comparator) {

        Person key;
        for (int i = 1; i < repository.size(); i++) {
            key = repository.get(i);
            int j = i - 1;
            while (j >= 0 && comparator.compare(repository.get(j), key) > 0) {
                repository.set(j + 1, repository.get(j));
                j = j - 1;
            }
            repository.set(j + 1, key);
        }
    }
}
