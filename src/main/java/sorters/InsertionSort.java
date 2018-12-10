package sorters;

import org.apache.log4j.Logger;
import person.Person;
import repository.RepositoryForPerson;

import java.util.Comparator;

/**
 * Class for Insertion sort
 */
public class InsertionSort implements Sorter {
    /**
     * Method for insertion sorting
     * @param repository repository that we want to sort
     * @param comparator comporator that will sort by specific parameters
     */
    private static final Logger log = Logger.getLogger(InsertionSort.class);

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

    @Override
    public String toString() {
        return "Insertion sorter";
    }
}
