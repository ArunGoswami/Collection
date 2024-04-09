package JDBCPackage1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    int age;
    double salary;

    Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class Employeetest {
    public static void main(String[] args) {
        try {
            // Connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");

            // Create table and insert records
            createTableAndInsertRecords(con);

            // Retrieve data from employee table and store it in a list of Employee objects
            List<Employee> employees = retrieveEmployees(con);

            // Using stream, get list of employees who are older than 25 years
            List<Employee> employeesOlderThan25 = employees.stream()
                    .filter(employee -> employee.age > 25)
                    .toList();

            // Display the list of employees older than 25 years
            System.out.println("Employees older than 25 years:");
            employeesOlderThan25.forEach(System.out::println);

            con.close(); // Close the connection
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createTableAndInsertRecords(Connection con) throws SQLException {
        Statement stmt = con.createStatement();
        // Create the employee table
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Employee (" +
                "id INT PRIMARY KEY," +
                "name VARCHAR(20)," +
                "age INT," +
                "salary DOUBLE)");

        // Insert records into the employee table
        stmt.executeUpdate("INSERT INTO Employee VALUES (1, 'Naresh', 22, 23432.6)");
        stmt.executeUpdate("INSERT INTO Employee VALUES (2, 'Suresh', 23, 32222.5)");
        stmt.executeUpdate("INSERT INTO Employee VALUES (3, 'Jain', 32, 43332.6)");
        stmt.executeUpdate("INSERT INTO Employee VALUES (4, 'David', 27, 15009.2)");
        stmt.executeUpdate("INSERT INTO Employee VALUES (5, 'Anthony', 34, 32322.5)");

        stmt.close();
    }

    private static List<Employee> retrieveEmployees(Connection con) throws SQLException {
        List<Employee> employees = new ArrayList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            double salary = rs.getDouble("salary");
            employees.add(new Employee(id, name, age, salary));
        }
        rs.close();
        stmt.close();
        return employees;
    }
}

