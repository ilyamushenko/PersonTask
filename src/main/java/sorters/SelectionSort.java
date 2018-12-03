package sorters;

import person.Person;
import repository.RepositoryForPerson;

import java.util.Comparator;

public class SelectionSort implements Sorter {
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
}
