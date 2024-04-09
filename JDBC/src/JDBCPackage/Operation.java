package JDBCPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Operation {
    public static void main(String[] args) throws Exception {
        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner scanner = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:oci8:@XE", "System", "oracle");
            scanner = new Scanner(System.in);

            System.out.print("Enter userName: ");
            String userName = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            System.out.print("Enter First Name: ");
            String ufname = scanner.nextLine();

            System.out.print("Enter Last Name: ");
            String ulname = scanner.nextLine();

            System.out.print("Enter Email ID: ");
            String mailid = scanner.nextLine();

            System.out.print("Enter Phone Number: ");
            String  phnumber = scanner.nextLine();

            pstmt = con.prepareStatement("INSERT INTO student (username, password, ufname, ulname, mailid, phnumber) VALUES(?,?,?,?,?,?)");
            pstmt.setString(1, userName);
            pstmt.setString(2, password);
            pstmt.setString(3, ufname);
            pstmt.setString(4, ulname);
            pstmt.setString(5, mailid);
            pstmt.setString(6,  phnumber);

            pstmt.executeUpdate();
            System.out.println("Insertion successful");
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
            if (con != null) {
                con.close();
            }
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
 