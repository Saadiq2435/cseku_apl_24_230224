package restaurant.controller;

import restaurant.model.*;
import restaurant.view.RestaurantView;

import java.util.List;

public class RestaurantController {
    private final Restaurant model;
    private final RestaurantView view;

    public RestaurantController(Restaurant model, RestaurantView view) {
        this.model = model;
        this.view = view;
    }

    public void displayMenu() {
        view.displayMenu(model.getMenus().get(0).getItems());
    }

    public void placeOrder(int orderId, Customer customer, List<MenuItem> items) {
        Order order = new Order(orderId, customer, items);
        model.addOrder(order);
        view.displayOrderSummary(order);
    }

    public void performEmployeeDuties(Employee employee) {
        view.displayEmployeeDuties(employee.getName() + " is performing their duties:");
        employee.performDuties();
    }
}
