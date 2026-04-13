class EnemySystem {

    private GameConfig config;

    public EnemySystem() {
        this.config = config.getInstance();
    }

    public void showEnemyConfig() {
        System.out.println("Configuración de enemigos:");
        System.out.println("Velocidad de enemigos: " + config.getEnemySpeed());
    }
}