package checkers;

import person.Person;

/**Интерфейс для поиска определенного человека в классе
 * @see CheckerPersonAge
 * @see CheckerDateOfBirth
 * @see CheckerFio
 * @author Мущенко Илья
 */
public interface Checker {
    /**
     *Метод для сравнения определенного поля в классе Person со значением object
     * @param person - человек,поле которого мы хотим сравнить с полем object
     * @param object - поле, которое мы сравниваем
     * @return true eсли нужное поле person равно object
     * или false в противном случае
     */
    boolean check(Person person, Object object);
}
