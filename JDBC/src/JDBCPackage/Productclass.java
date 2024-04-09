package JDBCPackage;

import java.beans.Statement;
import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Productclass {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:oci8:@XE", "System", "oracle");
        System.out.println("Connection established");
        Scanner scan = new Scanner(System.in); // Corrected to read from console

//        System.out.println("Enter the id");
//        int productId = scan.nextInt();
//        scan.nextLine(); // Consume newline character
//        
//        System.out.println("Enter the name");
//        String productName = scan.nextLine();
//
//        System.out.println("Enter the price");
//        int productPrice = scan.nextInt();
//
//        System.out.println("Enter the quantity");
//        int productQty = scan.nextInt();

//        PreparedStatement pstmt = con.prepareStatement("INSERT INTO Product VALUES (?, ?, ?, ?)");
//        pstmt.setInt(1, productId);
//        pstmt.setString(2, productName);
//        pstmt.setInt(3, productPrice);
//        pstmt.setInt(4, productQty);
//        pstmt.executeUpdate();
//        System.out.println("Product inserted successfully.");
//        con.close();
        
        
        java.sql.Statement st=con.createStatement();
       ResultSet rs= st.executeQuery("Select * from Product");
        while(rs.next()) {
        	int productId=rs.getInt("productId");
        	String productName=rs.getString("productName");
        	int productPrice=rs.getInt("productPrice");
        	int productQty=rs.getInt("productQty");
        	System.out.println(productId+""+productName+""+productPrice+""+productQty);
        }
    }
}
