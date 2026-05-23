package structural.proxy;

public class EmployeeImpl implements Employee {
    
    int id = 100;
    String name = "ABhijit";

    public void getEmpDetails(){
        System.out.println("Emp Details: [ ID : " + this.id +  ", Name: "+ this.name +"]");
    }
}
