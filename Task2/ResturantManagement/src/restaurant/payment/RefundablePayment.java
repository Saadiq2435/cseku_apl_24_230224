package restaurant.payment;

public interface RefundablePayment extends Payment {
    void refundPayment(double amount);
}

