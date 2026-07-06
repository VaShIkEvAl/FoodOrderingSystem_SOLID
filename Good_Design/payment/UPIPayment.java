package payment;

import service.PaymentService;

public class UPIPayment implements PaymentService{
    @Override
    public boolean paymentMethod(int orderTotal) {
        System.out.println("Payment Successfull of " + orderTotal  +" by UPI");
        return true;
    }
}
