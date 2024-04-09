package JDBCPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FundTransferTransactions {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:oci8:@XE", "System", "oracle");
            System.out.println("Connection established");

            // Prepare and execute the SQL query
            PreparedStatement pstmt = con.prepareStatement("SELECT balance FROM Account2 WHERE AccountNo = ?");
            pstmt.setInt(1, 1);
            ResultSet rs = pstmt.executeQuery();

            // Process the results
            if (rs.next()) {
                double balance = rs.getDouble("balance");
                System.out.println("Balance: " + balance);
            } else {
                System.out.println("No balance found for AccountNo 1");
            }

            // Close resources
            rs.close();
            pstmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
