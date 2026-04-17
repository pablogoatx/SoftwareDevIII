public class GameBoyItemFactory implements AbstractFactory {

    @Override
    public Coin createCoin() {
        return new GameBoyCoin();
    }

    @Override
    public LuckyBlock createLuckyBlock() {
        return new GameBoyLuckyBlock();
    }
}