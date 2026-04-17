public class Main {

    public static void main(String[] args) {

        Charger charger = new Charger();

        ForeignSocket foreignSocket = new ForeignSocket();

        Plug adapter = new PlugAdapter(foreignSocket);

        charger.charge(adapter);
    }
}