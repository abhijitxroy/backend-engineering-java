

package backend-engineering.design-patterns.creational.builder;

public class BuilderDesignPattern {

  public static void main(String[] args) {

    Employee employee = Employee.builder()
        .name("Abhijit")
        .designation("Backend Engineer")
        .location("Bangalore")
        .build();

    System.out.println(employee);
  }
}

// Real-world examples:
// DTO Creation
// Request Objects
// Configuration Objects
// Domain Models

class Employee {

  private final String name;
  private final String designation;
  private final String location;

  private Employee(EmployeeBuilder builder) {
    this.name = builder.name;
    this.designation = builder.designation;
    this.location = builder.location;
  }

  public static EmployeeBuilder builder() {
    return new EmployeeBuilder();
  }

  @Override
  public String toString() {
    return "Employee{name='" + name + "', designation='" + designation
        + "', location='" + location + "'}";
  }

  static class EmployeeBuilder {

    private String name;
    private String designation;
    private String location;

    public EmployeeBuilder name(String name) {
      this.name = name;
      return this;
    }

    public EmployeeBuilder designation(String designation) {
      this.designation = designation;
      return this;
    }

    public EmployeeBuilder location(String location) {
      this.location = location;
      return this;
    }

    public Employee build() {
      return new Employee(this);
    }
  }
}