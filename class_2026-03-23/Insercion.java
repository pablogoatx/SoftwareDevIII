import java.util.ArrayList;
import java.util.LinkedList;

public class Insercion {
    public static void main(String[] args) {
        int tamanoLista = 100000;
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // medir insercion al inicio del arraylist
        long inicioArrayList = System.nanoTime();
        for (int i = 0; i < tamanoLista; i++) {
            arrayList.add(0, i);
        }

        long finArrayList = System.nanoTime();
        System.out.println("Arraylist - insertion time at the beginning: " + (finArrayList - inicioArrayList) + " ns");

        // medir insercion al inicio linkedlist
        long inicioLinkedList = System.nanoTime();
        for (int i = 0; i < tamanoLista; i++) {
            linkedList.addFirst(i);
        }
        long finalLinkedList = System.nanoTime();
        System.out
                .println(
                        "LinkedList - insertion time at the beginning " + (finalLinkedList - inicioLinkedList) + " ns");
    }
}
