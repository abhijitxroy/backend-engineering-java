// Comparator Demo
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

// Backend engineering usage:
// Sorting pipelines
// Ranking systems
// Response ordering
// Collection processing patterns

// Comparator patterns directly influence backend sorting,
// analytics ranking and API response ordering.
class ComparatorDemo {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(5, "john"));
        employees.add(new Employee(1, "alexy"));
        employees.add(new Employee(4, "devin"));
        employees.add(new Employee(2, "oliver"));
        employees.add(new Employee(3, "alexender"));

        employees.forEach(System.out::println);
        System.out.println("============");
        Collections.sort(employees, java.util.Comparator.comparing(Employee::getName));

        employees.forEach(System.out::println);

    }
}

class Employee {
    private Integer id;
    private String name;

    Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (!java.util.Objects.equals(id, other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

}
