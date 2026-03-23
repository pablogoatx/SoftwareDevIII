import java.util.ArrayList;
import java.util.Collection;

public class Exercise1 {
  public static void main(String[] args) {
    Collection<String> names = new ArrayList<>();
    names.add("Jose");
    names.add("Pablo");
    names.add("Daniel");
    names.add("Hector");

    names.stream()
        .forEach(System.out::println);

    System.out.println("Does Pablo exist in the collection names? " + names.contains("Pablo"));
    System.out.println("Pablo has been removed " + names.remove("Pablo"));

    names.stream()
        .forEach(System.out::println);
  }
}