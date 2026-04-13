public class CreditCard implements Payment {

    @Override
    public void pay() {
        System.out.println("Pagando con tarjeta de credito");
    }

}
