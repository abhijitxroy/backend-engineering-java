package creational.builder;

public class App {
    
    public static void main(String[] args) {
        Employee emp = new EmployeeBuilder()
                                            .setId(1)
                                            .setName("Abhijit")
                                            .setProfession("Developer")
                                            .getEmployee();
        System.out.println("Employee: " + emp);
        
    }
    
}
