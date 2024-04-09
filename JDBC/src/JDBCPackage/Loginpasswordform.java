package JDBCPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Loginpasswordform {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection("jdbc:oracle:oci8:@XE", "System", "oracle")) {
                PreparedStatement pstmt = con.prepareStatement("SELECT * FROM customer WHERE roll=? AND marks=?");
                pstmt.setString(1, "sdf");
               

                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        System.out.println("Login successful");
                    } else {
                        System.out.println("Invalid user");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
