package JDBCPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Employee {
    int id;
    String name;
    int age;
    double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }

    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "oracle");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Employee222"); 

        List<Employee> li = new ArrayList<Employee>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            double salary = rs.getDouble("salary"); 
            li.add(new Employee(id, name, age, salary));
        }

     Stream<Employee> i= li.stream().filter(age->age.age>25);
     System.out.println(i);
//        for (Employee emp : li) {
//            System.out.println(emp);
//        }

        
        rs.close();
        st.close();
        con.close();
    }
}
