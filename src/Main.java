import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> dvoriane = new ArrayList<>(generateClients());
        dvoriane.sort(new ComparePersons());
        System.out.println(dvoriane);
        dvoriane.removeIf(isYounger(18));
        System.out.println(dvoriane);


    }
        private static List<Person> generateClients () {

            List<Person> list = new ArrayList<Person>();
            list.add(new Person("Generator", "Van Der Graaf", 62));
            list.add(new Person("Bob", "Dylan", 41));
            list.add(new Person("Pete", "Agnew", 17));
            list.add(new Person("Carlos", "Arana Castaneda", 25));
            list.add(new Person("Shu", "Wan I", 11));

            return list;
        }
    public static Predicate<Person> isYounger(Integer age){
        return p -> p.getAge() < age;
    }

    }

