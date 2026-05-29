import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByDemo {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", 80000),
                new Employee("Amit", 45000),
                new Employee("Priya", 90000),
                new Employee("Zoya", 40000),
                new Employee("Karan", 70000)
        );

        Map<Boolean, List<Employee>> partitionedEmployees =
                employees.stream()
                        .collect(Collectors.partitioningBy(
                                employee -> employee.getSalary() > 50000
                        ));

        System.out.println("High Salary Employees:");
        System.out.println(partitionedEmployees.get(true));

        System.out.println("\nOther Employees:");
        System.out.println(partitionedEmployees.get(false));
    }
}

class Employee {

    private final String name;
    private final double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name;
    }
}
