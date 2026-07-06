import model.Order;
import service.DeliveryType;
import service.NotificationService;
import service.PaymentService;
import java.util.*;

public class FoodOrderingSystem {
    private ArrayList<Order> orders;

    public FoodOrderingSystem(){
        orders = new ArrayList<>();
    }

    public void placeOrder(String restaurantName, int orderTotal, DeliveryType deliveryType, PaymentService paymentService, NotificationService notificationService){        
        boolean paymentSuccessfull = paymentService.paymentMethod(orderTotal);

        if(paymentSuccessfull){
            Order order = new Order(restaurantName, orderTotal, deliveryType);
            orders.add(order);

            deliveryType.processDelivery(order);
            notificationService.notificationService(order);
        }
    }
}