public class Main {
    public static void main(String[] args) {
        FunctionalInterfaceExample updateAction = () -> System.out.println("prueba");
        updateAction.update();
    }
}
