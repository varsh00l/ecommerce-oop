import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Notification> notifications;
    private Cart cart;
    private Payment payment;

    public Order(Cart cart, Payment payment) {
        this.cart = cart;
        this.payment = payment;
        this.notifications = new ArrayList<>();
    }

    public void addNotification(Notification n) {
         notifications.add(n);
    }

    public void placeOrder() {
        payment.pay(cart.calculateFinalPrice());
        for(Notification n:notifications){
            n.update("You are Order has been placed");
        }

    }
}
