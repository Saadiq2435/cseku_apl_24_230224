# Restaurant Management System

This project implements a **Restaurant Management System** using object-oriented principles, specifically adhering to the 
**SOLID design principles**. The system models the essential components of a restaurant, including menus, orders, customers,
employees, and payment options. Each class encapsulates specific attributes and behaviors, making the system modular, 
scalable, and maintainable.

---

## How SOLID Principles Are Applied

- **S**: **Single Responsibility Principle (SRP)**
- **O**: **Open/Closed Principle (OCP)**
- **L**: **Liskov Substitution Principle (LSP)**
- **I**: **Interface Segregation Principle (ISP)**
- **D**: **Dependency Inversion Principle (DIP)**

---

## Class Descriptions

### Restaurant Class

The `Restaurant` class represents the overall restaurant, managing menus, orders, customers, and employees.
It includes methods to add orders, employees, and customers and to retrieve menus and order lists.
This structure encapsulates restaurant operations and data, following **Single Responsibility Principle (SRP)** by focusing
on restaurant-specific management.

### Menu Class

The `Menu` class manages a collection of `MenuItem` objects, representing the items available in the restaurant. It provides
methods for adding and retrieving menu items.
By managing only menu-specific functions, it adheres to **SRP** while remaining open for extension by adding new item types,
upholding **Open/Closed Principle (OCP)**.

### MenuItem Class

The `MenuItem` class represents individual items on the menu, with attributes like `name` and `price`. This class 
encapsulates menu item details without handling other restaurant logic, maintaining **SRP** by focusing only on 
item-specific attributes.

### Order Class

The `Order` class manages customer orders, storing ordered items, calculating the total cost, and linking orders to a 
specific customer. This class follows **SRP** by encapsulating only order-related operations and data.
The design also adheres to **OCP** by allowing further extensions to order processing, such as tracking delivery time or 
adding custom notes.

### Customer Class

The `Customer` class models customers, encapsulating basic details such as `name` and `contact` information. **SRP** is 
upheld by focusing only on customer-specific attributes, making it easy to extend if additional customer details are needed.

### Employee Class

The `Employee` class is an abstract class that defines general employee attributes (`name`, `employeeId`) and includes a 
method for `performDuties`.
Subclasses like `Chef` and `Waiter` extend `Employee`, following **Liskov Substitution Principle (LSP)**, allowing 
specific employee types to substitute the base `Employee` class. Each subclass can perform its specific duties, 
maintaining modular and substitutable design.

### Chef Class

The `Chef` class extends `Employee` and models a chef’s role, focusing on food preparation duties. It overrides 
`performDuties` to specify chef-specific actions, such as preparing food.
This design adheres to **LSP** by allowing chefs to be treated as general employees.

### Waiter Class

The `Waiter` class also extends `Employee`, modeling a waiter’s responsibilities such as serving customers. Like the 
`Chef` class, it overrides `performDuties` to perform waiter-specific tasks.
This design maintains **LSP** by allowing waiters to substitute `Employee` without altering system behavior.

### Payment Interface

The `Payment` interface defines a general contract for making payments. Classes like `CashPayment`, `CardPayment`, 
and `DigitalPayment` implement `Payment`, following **Interface Segregation Principle (ISP)** by providing only the 
necessary payment method without requiring unrelated methods.

### CashPayment, CardPayment, and DigitalPayment Classes

These classes implement the `Payment` interface, each handling a specific type of payment. For instance, `CashPayment` 
models cash transactions, while `CardPayment` processes card payments.
**Open/Closed Principle (OCP)** is demonstrated here, as new payment types can be added without modifying existing code.

### RefundablePayment Interface

The `RefundablePayment` interface extends `Payment` by adding a `refundPayment` method, allowing only applicable payment
types to implement refund functionality.
This modular approach upholds **ISP** by ensuring only relevant classes handle refunds, and it allows future expansion 
for more refundable payment types.

### PaymentProcessor Class

The `PaymentProcessor` class is responsible for processing payments and depends on the `Payment` interface, following 
**Dependency Inversion Principle (DIP)** by relying on an abstraction rather than specific implementations.
This makes the payment process flexible, as any class implementing `Payment` can be used without changing the 
`PaymentProcessor` class.

---

## Example Usage

The `Main` class demonstrates the system’s functionality. It sets up a restaurant with a menu, initializes a customer 
and employees, processes an order, and completes a payment.

