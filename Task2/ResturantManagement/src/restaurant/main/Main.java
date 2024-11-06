package restaurant.main;

import restaurant.Restaurant;
import restaurant.customer.Customer;
import restaurant.employee.Chef;
import restaurant.employee.Employee;
import restaurant.employee.Waiter;
import restaurant.menu.Menu;
import restaurant.menu.MenuItem;
import restaurant.order.Order;
import restaurant.payment.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Step 1: Initialize Menu Items
        // Creating menu items that will be added to the menu.
        MenuItem pizza = new MenuItem("Pizza", 12.99);
        MenuItem burger = new MenuItem("Burger", 8.99);
        MenuItem pasta = new MenuItem("Pasta", 10.49);

        // Step 2: Create a Menu and add items to it
        // The menu is a collection of available menu items in the restaurant.
        List<MenuItem> menuItems = new ArrayList<>(Arrays.asList(pizza, burger, pasta));
        Menu menu = new Menu(menuItems);

        // Step 3: Initialize a Customer
        // Create a customer who will place an order in the restaurant.
        Customer customer = new Customer("Alice", "123-456-7890");

        // Step 4: Initialize Employees
        // Create a Chef and a Waiter, representing restaurant staff.
        Employee chef = new Chef("John", 1);
        Employee waiter = new Waiter("Emma", 2);

        // Step 5: Set up the Restaurant
        // The Restaurant aggregates menus, orders, customers, and employees.
        Restaurant restaurant = new Restaurant(
                List.of(menu),           // Menus available in the restaurant
                new ArrayList<>(),       // Start with an empty list of orders
                List.of(customer),       // List of customers, initially containing one
                List.of(chef, waiter)    // List of employees
        );

        // Step 6: Place an Order
        // The customer orders specific items from the menu. An order is created and added to the restaurant.
        List<MenuItem> orderedItems = List.of(pizza, burger); // Customer orders pizza and burger
        Order order = new Order(1, customer, orderedItems);
        restaurant.addOrder(order); // Add order to restaurant's order list

        // Step 7: Display Order Summary
        // Show order details such as total amount and ordered items.
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Customer: " + customer.getName());
        System.out.println("Ordered Items:");
        orderedItems.forEach(item -> System.out.println("- " + item.getName() + ": $" + item.getPrice()));
        System.out.println("Total Amount: $" + order.getTotalAmount());

        // Step 8: Process Payment
        // Process payment using the desired payment method (Cash in this example).
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Payment payment = new CashPayment(); // Payment can be CashPayment, CardPayment, or DigitalPayment
        System.out.println("\nProcessing Payment...");
        paymentProcessor.processPayment(payment, order.getTotalAmount()); // Process the payment

        // Step 9: Employees Perform Duties
        // Chef and Waiter perform their respective roles in the restaurant.
        System.out.println("\nEmployee Duties:");
        chef.performDuties(); // Output: Preparing food...
        waiter.performDuties(); // Output: Serving customers...

        // Step 10: Completion
        // Indicate that the order and payment process is complete.
        System.out.println("\nOrder completed and payment processed successfully!");
    }
}
