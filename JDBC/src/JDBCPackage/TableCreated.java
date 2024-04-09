package JDBCPackage;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class TableCreated {
public static void main(String[] args) throws Exception {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:oci8:@XE","System","oracle");
	//System.out.println("connection established");
	java.sql.Statement st=con.createStatement();
	boolean b=st.execute("create table customer(roll number(3),marks varchar(20))");
	System.err.println("Table created");
}
}
