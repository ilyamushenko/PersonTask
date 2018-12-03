package main;

import checkers.CheckerPersonAge;
import comparators.ComparatorFio;
import org.joda.time.LocalDate;
import person.Person;
import person.Sex;
import repository.RepositoryForPerson;
import sorters.BubbleSort;

public class Main {
    public static void main(String[] args) {
        RepositoryForPerson repository = new RepositoryForPerson(new BubbleSort());
        repository.add(new Person(0, "Миша", new LocalDate(1998, 2, 2), Sex.Male));
        repository.add(new Person(1, "Денис", new LocalDate(1998, 8, 1), Sex.Male));
        repository.add(new Person(2, "Димка", new LocalDate(2000, 3, 2), Sex.Male));
        repository.add(new Person(3, "Саня", new LocalDate(1997, 8, 20), Sex.Male));
        repository.add(new Person(4, "Игорь", new LocalDate(1997, 8, 20), Sex.Male));
        repository.add(new Person(5, "Илья", new LocalDate(1998, 7, 1), Sex.Male));
        repository.add(new Person(6, "Саша", new LocalDate(1999, 1, 24), Sex.Female));
        //repository.delete(2);

        /*for (int i = 0; i < repository.size(); i++) {
            System.out.println(repository.get(i));
        }*/
        repository.sort(new ComparatorFio());
        for (int i = 0; i < repository.size(); i++) {
            System.out.println(repository.get(i));
        }
        System.out.println("//////////////////////////////////");
        RepositoryForPerson rep = repository.find(new CheckerPersonAge(), 21);
        for(int i = 0; i < rep.size(); i++) {
            System.out.println(rep.get(i));
        }
    }
}
