package restaurant.model;

public abstract class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract void performDuties();

    public String getName() {
        return name;
    }
}

