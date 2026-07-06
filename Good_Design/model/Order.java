package model;

import service.DeliveryType;

public class Order {
    public String restaurantName;
    public int orderTotal;
    public DeliveryType deliveryType;

    public Order(String restaurantName, int orderTotal, DeliveryType deliveryType){
        this.restaurantName = restaurantName;
        this.orderTotal = orderTotal;
        this.deliveryType = deliveryType;
    }
}