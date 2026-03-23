
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        /*
         * list porque collection no tiene el metodo get ni set ni los add y remove con
         * index
         */
        List<String> collection = new ArrayList<>();
        // metodo add sin index
        collection.add("Motorcycle");
        collection.add("Car");
        collection.add("Airplane");

        // metodo isEmpty() y size()
        System.out.println("Is the list empty? " + collection.isEmpty());
        System.out.println("Total elements: " + collection.size());

        // otra List para agregarla a la anterior con el readAll
        List<String> collectionTemp = new ArrayList<>();
        collectionTemp.add("Apple");
        collectionTemp.add("Orange");
        collectionTemp.add("Pear");
        collection.addAll(collectionTemp);

        /*
         * metodo contains() y metodo containsAll() para revisar si tiene algun elemento
         * o
         * List dentro de él
         */
        System.out.println("Does collection contains pineapple?: " + collection.contains("Pineapple"));
        System.out.println("Does collection contains apple?: " + collection.contains("Apple"));
        System.out.println(
                "Does collectionTemp contains all from collection?: " + collectionTemp.containsAll(collection));
        System.out.println(
                "Does collection contains all from collectionTemp?: " + collection.containsAll(collectionTemp));
        System.out.println("Total elements from collection: " + collection.size());

        // metodo remove() sin index
        System.out.println("Apple removed? " + collection.remove("Apple"));

        // metodo set() con index
        collection.set(4, "Watermelon");
        System.out.println("Watermelon set over index 4");

        // convertir el List en stream para facilitar su utilizacion
        collection.stream()
                .forEach(System.out::println);

        // metodo get() con index
        System.out.println("Element from index 2: " + collection.get(2));
        // metodo indexOff()
        System.out.println("Index of Car: " + collection.indexOf("Car"));
        // metodo remove() con index
        System.out.println("Remove from index 3, " + collection.remove(3));

        // metodo add() con index
        collection.add(4, "Banana");
        System.out.println("Banana added");

        // mostrar la coleccion completa
        collection.stream()
                .forEach(System.out::println);

    }

    /*
     * metodo para comparar valores con el .equals()
     * private static boolean compareValues(String var, String value){
     * return var.equals(value);
     * }
     */
}