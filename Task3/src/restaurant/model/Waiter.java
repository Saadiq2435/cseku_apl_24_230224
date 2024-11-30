package restaurant.model;

public class Waiter extends Employee {
    public Waiter(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    public void performDuties() {
        System.out.println("Serving customers...");
    }
}
