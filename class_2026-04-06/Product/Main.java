import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> lista = new ArrayList<>();

        addProduct(lista, "Laptop", 1200, 5);
        addProduct(lista, "Mouse", 25, 20);
        addProduct(lista, "Teclado", 50, 15);
        addProduct(lista, "Monitor", 300, 8);

        System.out.println("Lista original:");
        printList(lista);

        Collections.sort(lista);
        System.out.println("\nOrden por cantidad (descendente):");
        printList(lista);

        // Collections.sort(lista, new ComparatorByName());
        compareLambda(lista);
        System.out.println("\nOrden por nombre:");
        printList(lista);

        Collections.sort(lista, new ComparatorByPrice());
        System.out.println("\nOrden por precio:");
        printList(lista);
    }

    public static void addProduct(ArrayList<Product> lista, String name, int price, int quantity) {
        lista.add(new Product(name, price, quantity));
    }

    public static void printList(ArrayList<Product> lista) {
        for (Product p : lista) {
            System.out.println("Nombre: " + p.getName() +
                    " | Precio: " + p.getPrice() +
                    " | Cantidad: " + p.getQuantity());
        }
    }

    private static void compareLambda(ArrayList<Product> list) {
        Collections.sort(list, (p1, p2) -> p1.getName().compareTo(p2.getName()));
    }
}
