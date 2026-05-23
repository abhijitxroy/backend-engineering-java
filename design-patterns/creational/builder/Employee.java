package creational.builder;

public class Employee {
    
    private int id;

    private String name;

    private int Age;

    private String profession;

    private String workLocation;

    private double salary;


    public Employee(int id, String name, int age, String profession, String workLocation, double salary) {
        this.id = id;
        this.name = name;
        Age = age;
        this.profession = profession;
        this.workLocation = workLocation;
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

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", Age=" + Age + ", profession=" + profession
                + ", workLocation=" + workLocation + ", salary=" + salary + "]";
    }

   

    
}
