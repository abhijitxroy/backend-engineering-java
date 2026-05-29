import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMapDemo {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", Arrays.asList("Java", "Spring")),
                new Employee("Amit", Arrays.asList("Docker", "Kubernetes")),
                new Employee("Priya", Arrays.asList("AWS", "Terraform"))
        );

        System.out.println("map() Result:");

        List<List<String>> skills = employees.stream()
                .map(Employee::getSkills)
                .collect(Collectors.toList());

        System.out.println(skills);

        System.out.println("\nflatMap() Result:");

        List<String> allSkills = employees.stream()
                .flatMap(employee -> employee.getSkills().stream())
                .collect(Collectors.toList());

        System.out.println(allSkills);
    }
}

class Employee {

    private final String name;
    private final List<String> skills;

    Employee(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return name;
    }
}
