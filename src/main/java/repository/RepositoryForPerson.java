package repository;

import checkers.Checker;
import person.Person;
import sorters.InsertionSort;
import sorters.Sorter;

import java.util.Comparator;

/**
 * Класс репоситория, который хранит в себе массив людей {@link Person},
 * количество людей,
 * и {@link Sorter} для сортировки
 */
public class RepositoryForPerson {
    private Person[] arrayOfPersons;
    private int count;
    private Sorter sorter;

    /**
     * Конструктор, который создаёт объект {@link RepositoryForPerson},
     * с уже заданным массивом людей {@link Person}
     * @param arrayOfPersons - массив людей {@link Person}
     */
    public RepositoryForPerson(Person[] arrayOfPersons) {
        this.arrayOfPersons = arrayOfPersons;
        this.count = arrayOfPersons.length;
        this.sorter = new InsertionSort();
    }

    /**
     * Конструктор, который ничего не принимает и создает
     * пустой репозиторий
     */
    private RepositoryForPerson() {
        this.count = 0;
        this.arrayOfPersons = new Person[0];
    }

    /**
     * Конструктор, который принимает {@link Sorter}, который
     * будет нам сортировать наших людей
     * @param sorter - сортировщик
     */
    public RepositoryForPerson(Sorter sorter) {
        this.arrayOfPersons = new Person[0];
        this.count = 0;
        this.sorter = sorter;
    }

    /**
     *Метод, с помощью которого мы получаем человека {@link Person} по id
     * @param index индекс человека, которого мы хотим получить
     * @return Человека по id
     */
    public Person get(int index) {return arrayOfPersons[index];}

    /**
     * Метод для получения количества человек
     * @return Количество людей
     */
    public int size() {return count;}

    /**
     * Метод для добавления человека ({@link Person}) в наш репоситорий ({@link RepositoryForPerson})
     * @param person человек, которого мы хоиим добавить
     */
    public void add(Person person) {
        Person[] tmp = new Person[count + 1];
        for(int i = 0; i < count; i++) {
            tmp[i] = arrayOfPersons[i];
        }
        tmp[count++] = person;
        arrayOfPersons = tmp;
    }

    /**
     * Метод для удаления человека ({@link Person}) из нашего репозитория ({@link RepositoryForPerson})
     * @param idToRemove id человека, которого необходимо удалить
     */
    public void delete(int idToRemove) {
        Person[] tmp = new Person[count - 1];
        int i = 0, j = 0;
        while (i < count - 1){
            if (arrayOfPersons[i].getId() == idToRemove)  {idToRemove = -1; j++; continue; }
            tmp[i] = arrayOfPersons[j];
            i++;
            j++;
        }
        count--;
        arrayOfPersons = tmp;
    }

    /**
     * Метод для поиска определенных людей, подходящих по нужному параметру
     * @param checker это наш checker, который помогает нам выбрать нужного человека
     * @param value это значение, по которому нам нужно искать человека
     * @return Новый репоситорий ({@link RepositoryForPerson}) с уже отобранными людьми
     */
    public RepositoryForPerson find(Checker checker, Object value) {
        RepositoryForPerson tempRep = new RepositoryForPerson();
        for (int i = 0; i < this.size(); i++) {
            if (checker.check(this.get(i), value)) tempRep.add(this.get(i));
        }
        return tempRep;
    }

    /**
     * Метод для сортировки людей
     * @param comparator сравнивает людей по определенным параметрам {@link Comparator}
     * @see comparators.ComparatorAge
     * @see comparators.ComparatorDateOfBirth
     * @see comparators.ComparatorFio
     */
    public void sort(Comparator<Person> comparator) {
        sorter.sort(this, comparator);
    }

    /**
     * Метод для вставки нового человека ({@link Person}) на определенное место
     * @param index индекс вставки
     * @param person новый человек ({@link Person})
     */
    public void set(int index, Person person) {
        arrayOfPersons[index] = person;
    }
}
