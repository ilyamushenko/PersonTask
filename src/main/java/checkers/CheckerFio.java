package checkers;

import person.Person;

/**
 * Класс, который наследуется от интерфейса {@link Checker}
 * для поиска человека с определенными ФИО
 */
public class CheckerFio implements Checker {
    /**
     * Сравнение по ФИО
     * @param person - человек,поле которого мы хотим сравнить с полем object
     * @param object - поле, которое мы сравниваем
     * @return true eсли нужное поле person равно object
     * или false в противном случае
     */
    public boolean check(Person person, Object object) {
        return person.getFio().equals(object);
    }
}
