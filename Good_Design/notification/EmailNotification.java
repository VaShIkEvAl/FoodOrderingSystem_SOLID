package notification;

import model.Order;
import service.NotificationService;

public class EmailNotification implements NotificationService{
    @Override
    public void notificationService(Order order) {
        System.out.println("----- Email Notification -----");
        System.out.println("Order from " + order.restaurantName + " has been placed successfully");
        System.out.println("Total Amount : " + order.orderTotal);
        System.out.println("-------------------------------");
    }
}
