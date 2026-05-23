package creational.builder;

public class EmployeeBuilder {
    
    private int id;

    private String name;

    private int Age;

    private String profession;

    private String workLocation;

    private double salary;

    public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setAge(int age) {
        Age = age;
        return this;
    }

    public EmployeeBuilder setProfession(String profession) {
        this.profession = profession;
        return this;
    }

    public EmployeeBuilder setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
        return this;
    }

    public EmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }

    public String getProfession() {
        return profession;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public double getSalary() {
        return salary;
    }

    public Employee getEmployee(){
        return new Employee(getId(), getName(),getAge(), getProfession(), getWorkLocation(), getSalary());
    }
}
