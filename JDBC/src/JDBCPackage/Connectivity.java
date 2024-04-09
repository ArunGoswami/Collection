package JDBCPackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectivity {
public static void main(String[] args) {
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:oci8:@XE","System","oracle");
	System.out.println("Connection established successfuly");
	}catch(Exception e) {
		System.out.println("Exception occured");
	}
}
}
