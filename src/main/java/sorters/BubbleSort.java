package sorters;

import org.apache.log4j.Logger;
import person.Person;
import repository.RepositoryForPerson;

import java.util.Comparator;

/**
 * Class for Bubble sort
 */
public class BubbleSort implements Sorter {
    /**
     * Method for bubble sorting
     * @param repository repository that we want to sort
     * @param comparator comporator that will sort by specific parameters
     */
    private static final Logger log = Logger.getLogger(BubbleSort.class);

    @Override
    public void sort(RepositoryForPerson repository, Comparator<Person> comparator) {
        for (int i = 0; i < repository.size() - 1; i++)
            for (int j = 0; j < repository.size() - i - 1; j++)
                if (comparator.compare(repository.get(j), repository.get(j + 1)) > 0){
                    Person temp = repository.get(j);
                    repository.set(j, repository.get(j + 1));
                    repository.set(j + 1, temp);
                }
    }

    @Override
    public String toString() {
        return "Bubble sorter";
    }
}
