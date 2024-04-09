package EmployeeDirectoryackage;

import java.util.ArrayList;

class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', position='" + position + "', salary=" + salary + '}';
    }
}

class Directory {
    private ArrayList<Employee> employees;

    public Directory() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void updateEmployee(int index, String newPosition, double newSalary) {
        Employee employee = employees.get(index);
        employee.setPosition(newPosition);
        employee.setSalary(newSalary);
    }

    public void deleteEmployee(int index) {
        employees.remove(index);
    }
}

public class EmployeeDirectoryExample1 {
    public static void main(String[] args) {
        // Create instance of Directory
        Directory employeeDirectory = new Directory();

        // Add employees
        employeeDirectory.addEmployee(new Employee("Alice", "Manager", 60000.0));
        employeeDirectory.addEmployee(new Employee("Bob", "Developer", 50000.0));

        // Display all employees
        System.out.println("Initial display after adding employees:");
        employeeDirectory.displayAllEmployees();

        // Update Bob's information
        employeeDirectory.updateEmployee(1, "Senior Developer", 55000.0);
        System.out.println("\nDisplay after updating Bob's information:");
        employeeDirectory.displayAllEmployees();

        // Delete Alice from the directory
        employeeDirectory.deleteEmployee(0);
        System.out.println("\nDisplay after deleting Alice from the directory:");
        employeeDirectory.displayAllEmployees();
    }
}

