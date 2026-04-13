public class Main {
    public static void main(String[] args) {

        var config = GameConfig.getInstance();

        config.setDifficulty("Dificil");
        config.setLives(3);
        config.setEnemySpeed(2.0);

        var enemySystem = new EnemySystem();
        var playerSystem = new PlayerSystem();

        System.out.println("Configuración inicial:");
        config.showConfig();

        System.out.println("Configuracion de los sistemas");
        enemySystem.showEnemyConfig();
        playerSystem.showPlayerConfig();

        System.out.println("Estan ocurriendo cambios en la configuracion global");
        config.setLives(10);
        config.setEnemySpeed(5.0);

        System.out.println("\nDespués de cambiar la configuración:");
        config.showConfig();

        System.out.println("Sistemas luego de cambiar la config(usan la misma)");
        enemySystem.showEnemyConfig();
        playerSystem.showPlayerConfig();
    }
}