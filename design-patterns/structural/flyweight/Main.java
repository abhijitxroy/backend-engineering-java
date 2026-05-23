package structural.flyweight;

public class Main {

    public static void main(String[] args) {

        Employee devEmployee1 = EmployeeFactory.getDeveloper("Developer");
        devEmployee1.getEmpDetails();

        Employee devEmployee2 = EmployeeFactory.getDeveloper("Developer");
        devEmployee2.getEmpDetails();

        Employee testerEmployee1 = EmployeeFactory.getTester("Tester");
        testerEmployee1.getEmpDetails();

        System.out.println("devEmployee1 hashcode: " + devEmployee1.hashCode());
        System.out.println("devEmployee2 hashcode: " + devEmployee2.hashCode());
        System.out.println("testerEmployee1 hashcode: " + testerEmployee1.hashCode());

    }

}
