public class NintendoDSItemFactory implements AbstractFactory {

    @Override
    public Coin createCoin() {
        return new NintendoDSCoin();
    }

    @Override
    public LuckyBlock createLuckyBlock() {
        return new NintendoDSLuckyBlock();
    }
}