package backend-engineering.design-patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompisiteDesignPattern {

  public static void main(String[] args) {

    Team engineeringTeam = new Team("Engineering Team");

    engineeringTeam.add(new Developer("Abhijit"));
    engineeringTeam.add(new Developer("John"));

    engineeringTeam.showDetails();
  }
}

// Real-world examples:
// Organization Hierarchies
// Category Trees
// Permission Trees
// File Systems

interface Employee {
  void showDetails();
}

class Developer implements Employee {

  private final String name;

  public Developer(String name) {
    this.name = name;
  }

  @Override
  public void showDetails() {
    System.out.println("Developer: " + name);
  }
}

class Team implements Employee {

  private final String name;
  private final List<Employee> employees = new ArrayList<>();

  public Team(String name) {
    this.name = name;
  }

  public void add(Employee employee) {
    employees.add(employee);
  }

  @Override
  public void showDetails() {

    System.out.println(name);

    for (Employee employee : employees) {
      employee.showDetails();
    }
  }
}
