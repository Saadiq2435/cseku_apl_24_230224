package restaurant.payment;

public class CashPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing cash payment of $" + amount);
    }
}
