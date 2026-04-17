public class Charger {

    public void charge(Plug plug) {
        System.out.println("Trying to charge...");
        plug.connect();
        System.out.println("Device charging...");
    }
}