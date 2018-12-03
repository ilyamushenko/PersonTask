package person;


import org.joda.time.LocalDate;
import org.joda.time.Years;

/**
 * Класс человека с полями:
 * id, ФИО, дата рождения, пол, возраст.
 */
public class Person {
    private int id;
    private String fio;
    private LocalDate dateOfBirth;
    private Sex sex;
    private int age;

    /**
     * Конструктор для создания человека со следующими параметрами
     * @param id  айдишник
     * @param fio  ФИО
     * @param dateOfBirth  Дата рождения
     * @param sex  Пол
     */
    public Person(int id, String fio, LocalDate dateOfBirth, Sex sex) {
        this.id = id;
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.age = this.getAge();
    }

    /**Получить id человека
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**Установить у человека поле id
     *
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**Получить возраст человека
     *
     * @return Возраст человека
     */
    public int getAge() {
        return Years.yearsBetween(dateOfBirth, new LocalDate()).getYears();
    }

    /**Устанавливить возраст
     *
     * @param age Количество лет
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**Получить ФИО
     *
     * @return ФИО
     */
    public String getFio() {
        return fio;
    }

    /**Установить ФИО
     *
     * @param fio ФИО
     */
    public void setFio(String fio) {
        this.fio = fio;
    }

    /**Получить дату рождения
     *
     * @return Дата рождения
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Устанавливить дату рождения.
     * @param dateOfBirth Дата рождения
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**Получить пол человека
     * @see Sex
     * @return Пол
     */
    public Sex getSex() {
        return sex;
    }

    /**Установить пол человека
     *
     * @param sex Пол
     */
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    /**
     *
     * @return строковое представдение объекта Person
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

