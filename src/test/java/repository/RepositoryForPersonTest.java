package repository;

import checkers.Checker;
import checkers.CheckerDateOfBirth;
import checkers.CheckerFio;
import checkers.CheckerAge;
import comparators.ComparatorAge;
import org.joda.time.LocalDate;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import person.Person;
import person.Sex;

import static org.junit.Assert.assertEquals;

/**
 * Class for test {@link RepositoryForPerson}
 */
public class RepositoryForPersonTest {

    /**
     * Object of repository for test
     */
    private static RepositoryForPerson rep = null;

    @BeforeClass
    public static void startTest() {
        rep  = new RepositoryForPerson(new Person[] {
                new Person(0, "Миша", new LocalDate(1998, 6, 3), Sex.Male),
                new Person(1, "Денис", new LocalDate(1998, 8, 1), Sex.Male),
                new Person(2, "Димка", new LocalDate(2000, 3, 2), Sex.Male),
                new Person(3, "Саня", new LocalDate(1997, 8, 20), Sex.Male),
                new Person(4, "Игорь", new LocalDate(1997, 8, 20), Sex.Male),
                new Person(5, "Илья", new LocalDate(1998, 7, 1), Sex.Male),
                new Person(6, "Саша", new LocalDate(1999, 1, 24), Sex.Female)
        });
    }

    /**
     * Test getting person by id
     */
    @Test
    public void testGet() {
        int sourceMale = 3;
        int sourceFemale = 6;
        Person expectedFemale = new Person(6, "Саша", new LocalDate(1999, 1, 24), Sex.Female);
        Person expectedMale = new Person(3, "Саня", new LocalDate(1997, 8, 20), Sex.Male);
        Person actualMale = rep.get(sourceMale);
        Person actualFemale = rep.get(sourceFemale);
        assertEquals("Возращает не того человека", expectedMale, actualMale);
        assertEquals("Возращает не того человека", expectedFemale, actualFemale);
    }

    /**
     * Test getting size of persons array
     */
    @Test
    public void testSize() {
        int expected = 7;
        int actual = rep.size();
        assertEquals("Возвращает не тот размер массива (репозитория)", expected, actual);
    }

    /**
     * Test adding person to repository
     */
    @Test
    public void testAdd() {
        System.out.println(rep);
        Person source = new Person(7, "Тест", new LocalDate(2000, 2, 22), Sex.Male);
        rep.add(source);
        System.out.println(rep);
        rep.delete(7);
    }

    /**
     * Test deleting by id
     */
    @Test
    public void testDelete() {
        rep.delete(7);
    }

    /**
     * Test finding person by any checkers
     */
    @Test
    public void testFind() {
        Checker checkerDateOfBirth = new CheckerDateOfBirth();
        Checker checkerFio = new CheckerFio();
        Checker checkerAge = new CheckerAge();
        System.out.println(rep);
        System.out.println(rep.find(checkerAge, 19));
        System.out.println(rep.find(checkerFio, "Саня"));
        System.out.println(rep.find(checkerDateOfBirth, "1999.1.1"));

    }

    /**
     * Test sorting
     */
    @Test
    public void testSort() {
        System.out.println(rep);
        rep.sort(new ComparatorAge());
        System.out.println(rep);
    }

    /**
     * Test insert person on position
     */
    @Test
    public void testSet() {
        System.out.println(rep);
        rep.set(0, new Person(7, "Тест", new LocalDate(2000, 2, 22), Sex.Male));
        System.out.println(rep);
    }

    /**
     * Method after testing.
     * Clear field rep
     */
    @AfterClass
    public static void endTest() {
        rep = null;
    }
}
