package other;

import org.apache.log4j.Logger;
import org.joda.time.LocalDate;
import person.Person;
import person.Sex;
import repository.RepositoryForPerson;

public class Utils {
    private static final Logger log = Logger.getLogger(Utils.class);

    public static void fillRepository(RepositoryForPerson repository) {
        log.info("Fill repository in Utils");
        repository.add(new Person(0, "Миша", new LocalDate(1998, 2, 2), Sex.Male));
        repository.add(new Person(1, "Денис", new LocalDate(1998, 8, 1), Sex.Male));
        repository.add(new Person(2, "Димка", new LocalDate(2000, 3, 2), Sex.Male));
        repository.add(new Person(3, "Саня", new LocalDate(1997, 8, 20), Sex.Male));
        repository.add(new Person(4, "Игорь", new LocalDate(1997, 8, 20), Sex.Male));
        repository.add(new Person(5, "Илья", new LocalDate(1998, 7, 1), Sex.Male));
        repository.add(new Person(6, "Саша", new LocalDate(1999, 1, 24), Sex.Female));
    }
}
