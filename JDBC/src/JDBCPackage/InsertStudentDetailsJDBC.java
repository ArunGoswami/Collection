package JDBCPackage;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudentDetailsJDBC {
    public static void main(String[] args) throws Exception {
    	Class.forName("oracle.jdbc.driver.OracleDriver");
    	Connection con=DriverManager.getConnection("jdbc:oracle:oci8:@XE","System","oracle");
    	System.out.println("Connection established successfuly");
    	
        CallableStatement cstmt = con.prepareCall("{call InsertStudentDetails(?, ?, ?, ?, ?, ?, ?, ?, ?)}");   
        cstmt.setInt(1, 1); // stuId
            cstmt.setInt(2, 101); // stuRollNo
            cstmt.setString(3, "John Doe"); // stuName
            cstmt.setString(4, "Computer Science"); // stuBranch
            cstmt.setString(5, "123 Main St"); // stuHno
            cstmt.setString(6, "New York"); // city
            cstmt.setInt(7, 10001); // pincode
            cstmt.setString(8, "john.doe@example.com"); // mid
            cstmt.setString(9, "1234567890"); // phno
            
            // Executing the stored procedure
            cstmt.execute();
            
            // Closing resources
            cstmt.close();
            con.close();
            
            System.out.println("Student details inserted successfully.");
       
    }
    }

