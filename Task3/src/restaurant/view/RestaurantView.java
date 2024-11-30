package restaurant.view;

import restaurant.model.Customer;
import restaurant.model.MenuItem;
import restaurant.model.Order;

import java.util.List;

public class RestaurantView {
    public void displayMenu(List<MenuItem> menuItems) {
        System.out.println("Menu:");
        for (MenuItem item : menuItems) {
            System.out.println("- " + item.getName() + ": $" + item.getPrice());
        }
    }

    public void displayOrderSummary(Order order) {
        System.out.println("\nOrder Summary:");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Ordered Items:");
        for (MenuItem item : order.getItems()) {
            System.out.println("- " + item.getName() + ": $" + item.getPrice());
        }
        System.out.println("Total Amount: $" + order.getTotalAmount());
    }

    public void displayPaymentConfirmation(double amount) {
        System.out.println("\nPayment of $" + amount + " has been processed successfully.");
    }

    public void displayEmployeeDuties(String duties) {
        System.out.println("\n" + duties);
    }
}
