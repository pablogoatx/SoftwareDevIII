public class Main {

    public static void main(String[] args) {

        AbstractFactory factory;

        // Usando GameBoy
        factory = new GameBoyItemFactory();
        Coin moneda = factory.createCoin();
        LuckyBlock bloque = factory.createLuckyBlock();

        moneda.show();
        bloque.hit();

        System.out.println("----------------------");

        // Usando Nintendo DS
        factory = new NintendoDSItemFactory();
        moneda = factory.createCoin();
        bloque = factory.createLuckyBlock();

        moneda.show();
        bloque.hit();

    }
}