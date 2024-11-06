package restaurant.order;

import restaurant.customer.Customer;
import restaurant.menu.MenuItem;

import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<MenuItem> items;
    private double totalAmount;

    public Order(int orderId, Customer customer, List<MenuItem> items) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
        calculateTotal();
    }

    private void calculateTotal() {
        totalAmount = items.stream().mapToDouble(MenuItem::getPrice).sum();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }
}

