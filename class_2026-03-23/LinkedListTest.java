import java.util.LinkedList;

//mutable, lo que cambia el arreglo inicial y no crea temporales

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bunny");

        animals.addFirst("frog");
        animals.addLast("sheep");
        System.out.println(animals.getFirst());
        System.out.println(animals.getLast());

        animals.removeFirst();
        animals.removeLast();
        System.out.println(animals);

    }
}