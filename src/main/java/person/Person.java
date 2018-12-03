package person;


import org.joda.time.LocalDate;
import org.joda.time.Years;

public class Person {
    private int id;
    private String fio;
    private LocalDate dateOfBirth;
    private Sex sex;
    private int age;

    public Person(int id, String fio, LocalDate dateOfBirth, Sex sex) {
        this.id = id;
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.age = this.getAge();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return Years.yearsBetween(dateOfBirth, new LocalDate()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

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

