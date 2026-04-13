class PlayerSystem {

    private GameConfig config;

    public PlayerSystem() {
        this.config = config.getInstance();
    }

    public void showPlayerConfig() {
        System.out.println("Configuración del jugador:");
        System.out.println("Vidas: " + config.getLives());
    }
}