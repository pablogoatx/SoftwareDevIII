
import java.util.ArrayList;
import java.util.Collection;

public class Test {

    
    public static void main(String[] args) {
       
        Collection<String> collection = new ArrayList<>();
        collection.add("Motorcycle");
        collection.add("Car");
        collection.add("Airplane");
        System.out.println("Is the list empty? " + collection.isEmpty());
        System.out.println("Total elements: " + collection.size());
        Collection<String> collectionTemp = new ArrayList<>();
        collectionTemp.add("Apple");
        collectionTemp.add("Orange");
        collectionTemp.add("Pear");
        collection.addAll(collectionTemp);
        System.out.println("Does collection contains pineapple?: " + collection.contains("Pineapple"));
        System.out.println("Does collection contains apple?: " + collection.contains("Apple"));
        System.out.println("Does collectionTemp contains all from collection?: " + collectionTemp.containsAll(collection));
        System.out.println("Does collection contains all from collectionTemp?: " + collection.containsAll(collectionTemp));
        System.out.println("Total elements from collection: " + collection.size());
        System.out.println("Apple removed? " + collection.remove("Apple"));
        collection.stream()
          .map(String::toUpperCase)
          .forEach(System.out::println);

    }
   
    /*private static boolean compareValues(String var, String value){
        return var.equals(value);
    }*/
}