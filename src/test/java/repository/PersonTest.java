package repository;

import org.joda.time.LocalDate;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import person.Person;
import person.Sex;

import static org.junit.Assert.assertEquals;


/**
 * Class for test class {@link Person}
 */
public class PersonTest {
    /**
     * Object, that we will test
     */
    private static Person person = null;

    /**
     * Run before all tests
     * Fill all fields.
     */
    @BeforeClass
    public static void startTest() {
        person = new Person(228, "Мущенко Илья Викторович", new LocalDate(1998, 7, 27), Sex.Male);
    }

    /**
     * Test getting person by id
     */
    @Test
    public void testGetId() {
        int expected = 228;
        int actual = person.getId();
        assertEquals("Person.getId() возвращает неверный ID", expected, actual);
    }
    /**
     * Test getting age
     */
    @Test
    public void testGetAge() {
        int expected = 20;
        int actual = person.getAge();
        assertEquals("Person.getAge() возвращает неверный возраст", expected, actual);
    }

    /**
     * Test getting FIO
     */
    @Test
    public void testGetFio() {
        String expected = "Мущенко Илья Викторович";
        String actual = person.getFio();
        assertEquals("Person.getFio() возвращает неверные ФИО", expected, actual);
    }

    /**
     * Тестирование получения даты рождения
     */
    @Test
    public void testGetDateOfBirth() {
        LocalDate expected = new LocalDate(1998, 7, 27);
        LocalDate actual = person.getDateOfBirth();
        assertEquals("Person.getDateOfBirth() возвращает неверную дату", expected, actual);
    }

    /**
     * Test getting sex
     */
    @Test
    public void testGetSex() {
        Sex expected = Sex.Male;
        Sex actual = person.getSex();
        assertEquals("Person.getSex() возвращает неверный пол человека", expected, actual);
    }

    /**
     * Ending of all tests.
     * Clear field person, with that we worked
     */
    @AfterClass
    public static void endTest() {
        person = null;
    }
}
