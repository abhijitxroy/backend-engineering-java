import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", "Engineering"),
                new Employee("Amit", "Engineering"),
                new Employee("Priya", "HR"),
                new Employee("Zoya", "HR"),
                new Employee("Karan", "Finance")
        );

        Map<String, List<Employee>> employeesByDepartment =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        employeesByDepartment.forEach(
                (department, employeeList) -> {
                    System.out.println(department + " -> " + employeeList);
                }
        );
    }
}

class Employee {

    private final String name;
    private final String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}
