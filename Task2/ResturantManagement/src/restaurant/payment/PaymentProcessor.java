package restaurant.payment;

public class PaymentProcessor {
    public void processPayment(Payment payment, double amount) {
        payment.makePayment(amount);
    }
}

