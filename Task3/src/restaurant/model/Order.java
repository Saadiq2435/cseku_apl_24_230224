package restaurant.model;

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

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
