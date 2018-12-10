package sorters;

import org.apache.log4j.Logger;
import person.Person;
import repository.RepositoryForPerson;

import java.util.Comparator;

/**
 * Class fot selection sort
 */
public class SelectionSort implements Sorter {
    /**
     * Method for selection sorting
     * @param repository repository that we want to sort
     * @param comparator comporator that will sort by specific parameters
     */
    private static final Logger log = Logger.getLogger(SelectionSort.class);

    @Override
    public void sort(RepositoryForPerson repository, Comparator<Person> comparator) {

        for(int i = 0; i<repository.size(); i++) {
            Person min = repository.get(i);
            int min_i = i;
            for (int j = i + 1; j < repository.size(); j++) {
                if (comparator.compare(repository.get(j), min) < 0) {
                    min = repository.get(j);
                    min_i = j;
                }
            }
            if (i != min_i) {
                Person tmp = repository.get(i);
                repository.set(i, repository.get(min_i));
                repository.set(min_i, tmp);
            }
        }
    }

    @Override
    public String toString() {
        return "Selection sorter";
    }
}
