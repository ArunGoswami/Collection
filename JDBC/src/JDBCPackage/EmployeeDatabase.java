package JDBCPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeDatabase {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "oracle");
        Statement st = con.createStatement();

        boolean tableCreated = st.execute("CREATE TABLE employee222 (id NUMBER(10), name VARCHAR(20), age NUMBER(20), salary NUMBER(10))");
        System.out.println(tableCreated ? "Table created" : "Table not created");

        int rowsInserted = st.executeUpdate("INSERT INTO employee222 (id, name, age, salary) VALUES (1, 'Suniya', 32, 100000)");
        System.out.println(rowsInserted + " row(s) inserted");

        con.close(); 
    }
}
