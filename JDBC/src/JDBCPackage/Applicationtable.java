package JDBCPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Applicationtable {
public static void main(String[] args) throws Exception {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:oci8:@XE","System","oracle");
	System.out.println("connection established");
    PreparedStatement pstmt = con.prepareStatement("SELECT * FROM customer WHERE roll=122 AND marks=99");
    if(pstmt.executeQuery() != null) {
    	
    }
}
}
