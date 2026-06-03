public class CashOnDelivery implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Order confirmed! Pay"+amount+"on delivery");
    }
}
