public class PlugAdapter implements Plug {

    private ForeignSocket socket;

    public PlugAdapter(ForeignSocket socket) {
        this.socket = socket;
    }

    @Override
    public void connect() {
        System.out.println("Using adapter...");
        socket.foreignConnect();
    }
}