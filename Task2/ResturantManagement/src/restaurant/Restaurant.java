package restaurant;

import restaurant.customer.Customer;
import restaurant.employee.Employee;
import restaurant.menu.Menu;
import restaurant.order.Order;

import java.util.List;

public class Restaurant {
    private List<Menu> menus;
    private List<Order> orders;
    private List<Customer> customers;
    private List<Employee> employees;

    public Restaurant(List<Menu> menus, List<Order> orders, List<Customer> customers, List<Employee> employees) {
        this.menus = menus;
        this.orders = orders;
        this.customers = customers;
        this.employees = employees;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public List<Order> getOrders() {
        return orders;
    }
}

