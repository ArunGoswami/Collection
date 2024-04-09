package JDBCPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertIntoTable {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "oracle");
        System.out.println("Connection established");

        Statement st = con.createStatement();
        String sql = "INSERT INTO student VALUES('arun', 'a', 'dt', 'ff', 'gg','fg')";
        int rowsAffected = st.executeUpdate(sql);
        System.out.println(rowsAffected + " row(s) affected");
        
        st.close();
        con.close();
    }
}
                                  