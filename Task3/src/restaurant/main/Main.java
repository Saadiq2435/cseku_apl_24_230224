package restaurant.main;

import restaurant.controller.RestaurantController;
import restaurant.model.*;
import restaurant.view.RestaurantView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MenuItem pizza = new MenuItem("Pizza", 12.99);
        MenuItem burger = new MenuItem("Burger", 8.99);
        MenuItem pasta = new MenuItem("Pasta", 10.49);

        Menu menu = new Menu(new ArrayList<>(Arrays.asList(pizza, burger, pasta)));

        Customer customer = new Customer("Alice", "123-456-7890");

        Chef chef = new Chef("John", 1);
        Waiter waiter = new Waiter("Emma", 2);

        Restaurant restaurant = new Restaurant(List.of(menu), List.of(customer), List.of(chef, waiter));

        RestaurantView view = new RestaurantView();

        RestaurantController controller = new RestaurantController(restaurant, view);

        controller.displayMenu();

        controller.placeOrder(1, customer, List.of(pizza, burger));

        controller.performEmployeeDuties(chef);
        controller.performEmployeeDuties(waiter);
    }
}
