package restaurant.payment;

public class CardPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing card payment of $" + amount);
    }
}
