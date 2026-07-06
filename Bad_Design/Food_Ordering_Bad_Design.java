import java.util.*;

class Order{
    String restaurantName;
    int orderTotal;
    String orderType;

    Order(String restaurantName, int orderTotal, String orderType){
        this.restaurantName = restaurantName;
        this.orderTotal = orderTotal;
        this.orderType = orderType;
    }
}

class FoodOrderingSystem{
    ArrayList<Order> orders;

    FoodOrderingSystem(){
        orders = new ArrayList<>();
    }
    
    public void placeOrder(String restaurantName, int orderTotal, String orderType, String paymentType){
        boolean paymentSuccessfull = false;

        if(paymentType.equals("Credit Card")){
            paymentSuccessfull = processCreditCardPayment(orderTotal);

        }
        else if(paymentType.equals("UPI")){
            paymentSuccessfull = processUPIPayment(orderTotal);
        }
        
        if(paymentSuccessfull){
            Order order = new Order(restaurantName, orderTotal, orderType);
            orders.add(order);

            emailNotification(order);
            smsNotification(order);
        }
    }
    
    public boolean processCreditCardPayment(int orderTotal){
        System.out.println("Payment Successfull of " + orderTotal  +" by Credit Card");
        return true;
    }
    
    public boolean processUPIPayment(int orderTotal){
        System.out.println("Payment Successfull of " + orderTotal  +" by UPI");
        return true;
    }

    public void emailNotification(Order order){
        System.out.println("----- Email Notification -----");

        if (order.orderType.equals("Delivery")) {
            System.out.println("Order from " + order.restaurantName + " has been placed successfully");
            System.out.println("Total Amount : " + order.orderTotal);
            System.out.println("Oder will be delivered");
        } else if (order.orderType.equals("PickUp")) {
            System.out.println("Order from " + order.restaurantName + " has been placed successfully");
            System.out.println("Total Amount : " + order.orderTotal);
            System.out.println("Customer will pick up the order");
        }
    }
    
    public void smsNotification(Order order) {
        System.out.println("----- SMS Notification -----");

        if (order.orderType.equals("Delivery")) {
            System.out.println("Order from " + order.restaurantName + " has been placed successfully");
            System.out.println("Total Amount : " + order.orderTotal);
            System.out.println("Oder will be delivered");
        } else if (order.orderType.equals("PickUp")) {
            System.out.println("Order from " + order.restaurantName + " has been placed successfully");
            System.out.println("Total Amount : " + order.orderTotal);
            System.out.println("Customer will pick up the order");
        }
    }
}

public class Food_Ordering_Bad_Design{
    public static void main(String[] args) {
        FoodOrderingSystem food_Ordering_System = new FoodOrderingSystem();
        food_Ordering_System.placeOrder("McD", 150, "Delivery", "UPI");
        System.out.println();
        food_Ordering_System.placeOrder("Dominos", 1000, "PickUp", "Credit Card");
    }
}