public class Main {
    public static void main(String[] args) {

        PaymentFactory creditFactory = new CreditCardFactory();
        Payment creditPayment = creditFactory.createPayment();
        creditPayment.pay();

        PaymentFactory paypalFactory = new PaypalFactory();
        Payment paypalPayment = paypalFactory.createPayment();
        paypalPayment.pay();
    }
}