package restaurant.employee;

public class Chef extends Employee {
    public Chef(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    public void performDuties() {
        System.out.println("Preparing food...");
    }
}

