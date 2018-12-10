package main;

import org.apache.log4j.Logger;
import other.Utils;
import repository.RepositoryForPerson;

import java.util.Arrays;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        log.info("Run main with arguments: " + Arrays.toString(args));
        RepositoryForPerson repository = new RepositoryForPerson();
        log.info("Fill repository by Utils");
        Utils.fillRepository(repository);
        System.out.println(repository);
//        log.info("Sort repository in main");
//        repository.sort(new ComparatorFio());
//        log.info("Print repository in main");
//        for (int i = 0; i < repository.size(); i++) {
//            System.out.println(repository.get(i));
//        }
//        System.out.println("//////////////////////////////////");
//        log.info("Create new repository with people whom age = 21");
//        RepositoryForPerson rep = repository.find(new CheckerAge(), 21);
//        log.info("Print repository with people whom age = 21 in main");
//        for(int i = 0; i < rep.size(); i++) {
//            System.out.println(rep.get(i));
//        }
    }
}
