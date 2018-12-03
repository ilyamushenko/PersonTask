package sorters;

import person.Person;
import repository.RepositoryForPerson;

import java.util.Comparator;

public class BubbleSort implements Sorter {
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
}
