import delivery.HomeDelivery;
import delivery.PickupDelivery;
import notification.EmailNotification;
import notification.SMSNotification;
import payment.CreditCardPayment;
import payment.UPIPayment;

public class Food_Ordering_Good_Design{
    public static void main(String[] args) {
        FoodOrderingSystem foodOrderingSystem = new FoodOrderingSystem();
        foodOrderingSystem.placeOrder("McD", 150, new HomeDelivery(), new CreditCardPayment(), new EmailNotification());
        System.out.println();
        System.out.println();
        FoodOrderingSystem foodOrderingSystem2 = new FoodOrderingSystem();
        foodOrderingSystem2.placeOrder("Dominos", 1500, new PickupDelivery(), new UPIPayment(), new SMSNotification());
    }
}