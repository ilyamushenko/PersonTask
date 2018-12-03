package repository;

import checkers.Checker;
import person.Person;
import sorters.InsertionSort;
import sorters.Sorter;

import java.util.Comparator;

public class RepositoryForPerson {
    private Person[] arrayOfPersons;
    private int count;
    private Sorter sorter;

    public RepositoryForPerson(Person[] arrayOfPersons) {
        this.arrayOfPersons = arrayOfPersons;
        this.count = arrayOfPersons.length;
        this.sorter = new InsertionSort();
    }

    public RepositoryForPerson() {
        this.arrayOfPersons = new Person[0];
        this.count = 0;
    }

    public Person get(int index) {return arrayOfPersons[index];}

    public int size() {return count;}

    public void add(Person person) {
        Person[] tmp = new Person[count + 1];
        for(int i = 0; i < count; i++) {
            tmp[i] = arrayOfPersons[i];
        }
        tmp[count++] = person;
        arrayOfPersons = tmp;
    }

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

    public RepositoryForPerson find(Checker checker, Object value) {
        RepositoryForPerson tempRep = new RepositoryForPerson();
        for (int i = 0; i < this.size(); i++) {
            if (checker.check(this.get(i), value)) tempRep.add(this.get(i));
        }
        return tempRep;
    }

    public void sort(Sorter sorter, Comparator<Person> comparator) {
        sorter.sort(this, comparator);
    }

    public void set(int index, Person person) {
        arrayOfPersons[index] = person;
    }
}
