package sorters;

import person.Person;
import repository.RepositoryForPerson;

import java.util.Comparator;

/**
 * Класс для сортировки пузырьком
 */
public class BubbleSort implements Sorter {
    /**
     * Метод для сортировки пузырьком
     * @param repository репозиторий, который мы хотим отсортировать
     * @param comparator компоратор, который будет сортировать по определенным параметрам
     */
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
