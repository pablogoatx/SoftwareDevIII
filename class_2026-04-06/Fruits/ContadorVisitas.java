public class ContadorVisitas {

    // Instancia única
    private static ContadorVisitas instance;

    // Atributo contador
    private int visitas;

    // Constructor privado
    private ContadorVisitas() {
        visitas = 0;
    }

    // Método para obtener instancia
    public static ContadorVisitas getInstance() {
        if (instance == null) {
            instance = new ContadorVisitas();
        }
        return instance;
    }

    // Incrementar visitas
    public void incrementar() {
        visitas++;
    }

    // Obtener visitas
    public int getVisitas() {
        return visitas;
    }
}
