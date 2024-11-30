package restaurant.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Menu> menus;
    private List<Order> orders;
    private List<Customer> customers;
    private List<Employee> employees;

    public Restaurant(List<Menu> menus, List<Customer> customers, List<Employee> employees) {
        this.menus = menus;
        this.orders = new ArrayList<>();
        this.customers = customers;
        this.employees = employees;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
