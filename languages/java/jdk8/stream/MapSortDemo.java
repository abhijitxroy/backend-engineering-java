import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

// Backend engineering usage:
// Ranking operations
// Report generation sorting
// Analytics processing
// Aggregation result ordering

public class MapSortDemo {

    public static void main(String[] args) {
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("Seven", 7);
        numberMap.put("Three", 3);
        numberMap.put("One", 1);
        numberMap.put("Eight", 8);

        // Way-1 - Collections sort and anonymous Comparator
        List<Entry<String, Integer>> list1 = new ArrayList<>(numberMap.entrySet());
        Collections.sort(list1, new Comparator<Entry<String,Integer>>() {

            @Override
            public int compare(Entry<String,Integer> o1, Entry<String,Integer> o2){
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println(list1);


        // Way-2 - Collections sort and comparator lambda function  
        List<Entry<String, Integer>> list2 = new ArrayList<>(numberMap.entrySet());
        Collections.sort(list2, Map.Entry.comparingByValue());
        System.out.println(list2);

        //  Way-3 using stream & Map.entry.comparingByValue()
        numberMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        // Way-4 using stream on Employee object
        Map<Employee, Integer> empMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2){
                return Double.compare(o2.getSalary(), o1.getSalary());
            }
        });
        empMap.put(new Employee(7, "Salvis", "IT", 30000.00), 7);
        empMap.put(new Employee(3, "Oliver", "DevOps", 60000.00), 3);
        empMap.put(new Employee(1, "Tony", "Scientist", 100000.00), 1);
        empMap.put(new Employee(8, "Abhijit", "IT", 70000.00), 8);

        // Sort by highest salary of Employee
        empMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparingDouble(Employee::getSalary).reversed()))
                .forEach(System.out::println); 
    }
}

// Sorting patterns directly influence backend reporting pipelines,
// ranking systems and analytics processing.
class Employee {
    private int id;
    private String name;
    private String dept;
    private double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
    }
}
