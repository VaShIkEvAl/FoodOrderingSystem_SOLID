package delivery;

import model.Order;
import service.DeliveryType;

public class HomeDelivery implements DeliveryType{
    @Override
    public void processDelivery(Order order) {
        System.out.println("Order will be delivered to customer's address : deliveryType = HomeDelivery");
    }
}
