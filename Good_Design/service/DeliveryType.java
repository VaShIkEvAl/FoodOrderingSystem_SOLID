package service;

import model.Order;

public interface DeliveryType {
    void processDelivery(Order order);
}