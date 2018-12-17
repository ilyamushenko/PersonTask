package repository;

import checkers.Checker;
import config.Inject;
import config.Injector;
import org.apache.log4j.Logger;
import person.Person;
import sorters.InsertionSort;
import sorters.Sorter;

import java.util.Comparator;

/**
 * Class repository that stores an array of people {@link Person},
 * count of people,
 * and {@link Sorter} for sorting
 */
public class RepositoryForPerson {
    private Person[] arrayOfPersons;
    private int count;
    @Inject
    private Sorter sorter;
    private static final Logger log = Logger.getLogger(RepositoryForPerson.class);


    /**
     * The constructor that creates the {@link RepositoryForPerson} object,
     * with an already specified array of people {@link Person}.
     * Default sorter = {@link InsertionSort}
     * @param arrayOfPersons - an array of people {@link Person}
     */
    public RepositoryForPerson(Person[] arrayOfPersons) {
        log.info("Create repository with array of persons");
        this.arrayOfPersons = arrayOfPersons;
        this.count = arrayOfPersons.length;
        new Injector().inject(this);
    }

    /**
     * A constructor that takes nothing and creates
     * empty repository
     */
    public RepositoryForPerson() {
        this.count = 0;
        this.arrayOfPersons = new Person[0];
        new Injector().inject(this);
    }

    /**
     * A constructor that get {@link Sorter}, which
     * will sort our people
     * @param sorter sorter
     */
    public RepositoryForPerson(Sorter sorter) {
        log.info("Create repository with sorter " + sorter);
        this.arrayOfPersons = new Person[0];
        this.count = 0;
        this.sorter = sorter;
    }

    /**
     * The method by which we get a person {@link Person} by id
     * @param index index of the person that we want to get
     * @return person by id
     */
    public Person get(int index) {
        log.info("Get person for repository in index = " + index);
        return arrayOfPersons[index];
    }

    /**
     * Method to get count of people
     * @return count of people
     */
    public int size() {return count;}

    /**
     * Method for adding a person ({@link Person}) to our repository ({@link RepositoryForPerson})
     * @param person is the person which we want to add.
     */
    public void add(Person person) {
        log.info("Add a person: " + person);
        Person[] tmp = new Person[count + 1];
        for(int i = 0; i < count; i++) {
            tmp[i] = arrayOfPersons[i];
        }
        tmp[count++] = person;
        arrayOfPersons = tmp;
    }

    /**
     * Method for deleting a person ({@link Person}) from our repository ({@link RepositoryForPerson})
     * @param idToRemove id of the person which you want to delete
     */
    public void delete(int idToRemove) {
        log.info("delete person on id =" + idToRemove);
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
     * Method to search for specific people that match the desired parameter.
     * @param checker is our checker that helps us to choose the right person.
     * @param value is the value by which we need to search for a person.
     * @return New repositories ({@link RepositoryForPerson}) with already selected people
     */
    public RepositoryForPerson find(Checker checker, Object value) {
        log.info("Try to find person, using " + checker + ". And find person with param " + value);
        RepositoryForPerson tempRep = new RepositoryForPerson();
        for (int i = 0; i < this.size(); i++) {
            if (checker.check(this.get(i), value)) tempRep.add(this.get(i));
        }
        return tempRep;
    }

    /**
     * Method for sorting people
     * @param comparator compares people by certain parameters {@link Comparator}
     * @see comparators.ComparatorAge
     * @see comparators.ComparatorDateOfBirth
     * @see comparators.ComparatorFio
     */
    public void sort(Comparator<Person> comparator) {
        log.info("Sort repository by " + this.sorter + " using " + comparator );
        sorter.sort(this, comparator);
    }

    @Override
    public String toString() {
        String result = "Repository:\nPersons :\n";
        for(Person el : arrayOfPersons) {
            result += el + ",\n";
        }
        result += "Count of persons: " + count + "\n" + "Sorter: " + sorter;
        return result;
    }

    /**
     * Method to insert a new person ({@link Person}) to a specific place.
     * @param index insert index
     * @param person new person ({@link Person})
     */
    public void set(int index, Person person) {
        arrayOfPersons[index] = person;
    }
}
