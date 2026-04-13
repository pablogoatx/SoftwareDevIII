public class PaypalFactory extends PaymentFactory {

    @Override
    public Payment createPayment() {
        return new Paypal();
    }
}