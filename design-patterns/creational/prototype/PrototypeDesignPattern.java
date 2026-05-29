

package backend-engineering.design-patterns.creational.prototype;

public class PrototypeDesignPattern {

  public static void main(String[] args) {

    Employee originalEmployee =
        new Employee("Abhijit", "Backend Engineer");

    Employee clonedEmployee = originalEmployee.clone();

    System.out.println("Original : " + originalEmployee);
    System.out.println("Cloned   : " + clonedEmployee);
  }
}

// Real-world examples:
// Configuration Templates
// Request Templates
// Caching Systems
// Document Generation

class Employee {

  private final String name;
  private final String designation;

  public Employee(String name, String designation) {
    this.name = name;
    this.designation = designation;
  }

  public Employee clone() {
    return new Employee(name, designation);
  }

  @Override
  public String toString() {
    return "Employee{name='" + name
        + "', designation='" + designation + "'}";
  }
}