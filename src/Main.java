import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> dvoriane = new ArrayList<>(generateClients());
        Comparator<Person> comparator = (o1, o2) -> {
            int surnameFirst = o1.getSurname().split("\\P{IsAlphabetic}+").length;
            int surnameSecond = o2.getSurname().split("\\P{IsAlphabetic}+").length;
            if (surnameFirst > surnameSecond) {
                return -1;
            } else if (surnameFirst < surnameSecond) {
                return 1;
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        dvoriane.sort(comparator);
        System.out.println(dvoriane);
    }

    private static List<Person> generateClients() {

        List<Person> list = new ArrayList<Person>();
        list.add(new Person("Generator", "Van Der Graaf", 62));
        list.add(new Person("Bob", "Dylan", 41));
        list.add(new Person("Pete", "Agnew", 33));
        list.add(new Person("Carlos", "Arana Castaneda", 25));
        list.add(new Person("Shu", "Wan I", 77));

        return list;
    }
}
