public class Main {

    public static void main(String[] args) {

        ContadorVisitas c1 = ContadorVisitas.getInstance();
        c1.incrementar();
        c1.incrementar();

        System.out.println("Visitas desde c1: " + c1.getVisitas());

        ContadorVisitas c2 = ContadorVisitas.getInstance();
        c2.incrementar();

        System.out.println("Visitas desde c2: " + c2.getVisitas());

        System.out.println(c1 == c2);
    }
}