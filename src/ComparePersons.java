import java.util.Comparator;
import java.util.function.Predicate;

import java.util.List;

public class ComparePersons implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        int surnameFirst = o1.getSurname().split("\\P{IsAlphabetic}+").length;
        int surnameSecond = o2.getSurname().split("\\P{IsAlphabetic}+").length;
        if (surnameFirst > surnameSecond) {
            return -1;
        } else if (surnameFirst < surnameSecond) {
            return 1;
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

}
