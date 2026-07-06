package delivery;

import model.Order;
import service.DeliveryType;

public class PickupDelivery implements DeliveryType{
    @Override
    public void processDelivery(Order order) {
        System.out.println("Customer will pick up the order : deliveryType = PuckUp");
    }
}