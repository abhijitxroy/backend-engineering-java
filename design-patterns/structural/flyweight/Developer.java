package structural.flyweight;

public class Developer implements Employee{

    private String name;

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void getEmpDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee IdCard: " + EmployeeCommon.idCard);
        System.out.println("Employee Laptop: " + EmployeeCommon.idCard);
        System.out.println("Employee Charger: " + EmployeeCommon.idCard);
        System.out.println("Employee Bag: " + EmployeeCommon.idCard);
        System.out.println("Employee Mug: " + EmployeeCommon.idCard);
        System.out.println("Employee Monitor: " + EmployeeCommon.idCard);
    }


    
}
