package sorters;

import person.Person;
import repository.RepositoryForPerson;

import java.util.Comparator;

/**
  *Interface for sorting classes, which has one sort method - actually
  * he does the sorting
  */
public interface Sorter {
    /**
     * Method for sorting
     * @param repository repository that we want to sort
     * @param comparator comporator that will sort by specific parameters
     * @see comparators.ComparatorAge
     * @see comparators.ComparatorDateOfBirth
     * @see comparators.ComparatorFio
     */
    void sort(RepositoryForPerson repository, Comparator<Person> comparator);


}
