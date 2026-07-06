package payment;

import service.PaymentService;

public class CreditCardPayment implements PaymentService{
    @Override
    public boolean paymentMethod(int orderTotal) {
        System.out.println("Payment Successfull of " + orderTotal  +" by Credit Card");
        return true;
    }
}
