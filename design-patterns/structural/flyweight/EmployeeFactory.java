package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    
    private static final Map<String, Employee> map = new HashMap<>();

    public static Employee getDeveloper(String empType){

        String key = empType;
        Employee employee = null;

        if(map.containsKey(key)){
            employee = map.get(key);
        }
        else{
            employee = new Developer();
            employee.setName("Developer");
            map.put(key, employee);
        }
        return employee;
    }

    public static Employee getTester(String empType){

        String key = empType;
        Employee employee = null;

        if(map.containsKey(key)){
            employee = map.get(key);
        }
        else{
            employee = new Tester();
            employee.setName("Tester");
            map.put(key, employee);
        }
        return employee;
    }
    
}
