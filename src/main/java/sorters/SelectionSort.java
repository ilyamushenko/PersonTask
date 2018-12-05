package sorters;

import person.Person;
import repository.RepositoryForPerson;

import java.util.Comparator;

/**
 * Класс для сортировки выбором
 */
public class SelectionSort implements Sorter {
    /**
     * Метод для сортировки выбором
     * @param repository репозиторий, который мы хотим отсортировать
     * @param comparator компоратор, который будет сортировать по определенным параметрам
     */
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
