//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Electronics phone=new Electronics("samsung s21",(long)123444,(double)32000,5,12,"Samsung");

       Cart cart=new Cart();
       cart.addItem(phone);

        cart.displayCart();
        cart.calculatePrice();
        cart.setDiscount(new PercentDiscount("Sale", 10));

        Payment payment =new CashOnDelivery();
        Order order=new Order(cart,payment);
        order.addNotification(new EmailNotification("varsh@gmail.com"));
        order.addNotification(new SmsNotification("9876543210"));
        order.placeOrder();


    }
}