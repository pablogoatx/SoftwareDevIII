import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();
        set1.add("Adam");
        set1.add("Mary");
        set1.add("Katy");
        set1.add("Carlos");
        set1.add("Juan");
        set1.stream().forEach(System.out::println);
    }
}
