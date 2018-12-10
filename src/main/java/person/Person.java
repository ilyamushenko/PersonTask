package person;


import org.apache.log4j.Logger;
import org.joda.time.LocalDate;
import org.joda.time.Years;

import java.util.Objects;

/**
 * Class person with fields:
 * id, FIO, date of birth, sex, age.
 */
public class Person {
    private int id;
    private String fio;
    private LocalDate dateOfBirth;
    private Sex sex;
    private int age;
    private static final Logger log = Logger.getLogger(Person.class);


    /**
     * Constructor to create a person with the following parameters
     * @param id  identifier
     * @param fio  FIO
     * @param dateOfBirth  date of birth
     * @param sex  sex
     */
    public Person(int id, String fio, LocalDate dateOfBirth, Sex sex) {
        this.id = id;
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.age = this.getAge();
    }

    /**Get person's id
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**Set person's id
     *
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**Get person's age
     *
     * @return age
     */
    public int getAge() {
        return Years.yearsBetween(dateOfBirth, new LocalDate()).getYears();
    }

    /**Set person's age
     *
     * @param age age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**Get person's FIO
     *
     * @return FIO
     */
    public String getFio() {
        return fio;
    }

    /**Set person's FIO
     *
     * @param fio FIO
     */
    public void setFio(String fio) {
        this.fio = fio;
    }

    /**Get person's date of birth
     *
     * @return date of birth
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Set person's date of birth
     * @param dateOfBirth date of birth
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**Get person's sex
     * @see Sex
     * @return sex
     */
    public Sex getSex() {
        return sex;
    }

    /**Set person's age
     *
     * @param sex sex
     */
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId() == person.getId() &&
                getAge() == person.getAge() &&
                Objects.equals(getFio(), person.getFio()) &&
                Objects.equals(getDateOfBirth(), person.getDateOfBirth()) &&
                getSex() == person.getSex();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFio(), getDateOfBirth(), getSex(), getAge());
    }

    /**
     * @return String representation of the class person
     */
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}

