package checkers;

import person.Person;

/**
 * Класс, который наследуется от интерфейса {@link Checker}
 * для поиска человека с определенным возрастом
 */
public class CheckerPersonAge implements Checker {
    /**
     * Сравнение по возрасту (количество лет)
     * @param person - человек,поле которого мы хотим сравнить с полем object
     * @param object - поле, которое мы сравниваем
     * @return true eсли нужное поле person равно object
     * или false в противном случае
     */
    public boolean check(Person person, Object object) {
        return Integer.valueOf(person.getAge()).equals(object);
    }
}
