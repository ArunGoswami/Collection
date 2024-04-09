package JDBCPackage;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee_Info {
public static void main(String[] args) throws Exception {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:oci8:@XE","System","oracle");
	System.out.println("Connection established successfuly");
	Statement st=con.createStatement();

}
}
