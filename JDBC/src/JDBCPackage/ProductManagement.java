package JDBCPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {
        try {
            // Establishing database connection
            Connection con = DriverManager.getConnection("jdbc:oracle:oci8:@XE", "System", "oracle");
            System.out.println("Connection established");

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Options:");
                System.out.println("1. Insert product details");
                System.out.println("2. Retrieve product details in forward direction");
                System.out.println("3. Retrieve product details in reverse direction");
                System.out.println("4. Retrieve 3rd record from top");
                System.out.println("5. Retrieve 3rd record from bottom");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        insertProductDetails(con, scanner);
                        break;
                    case 2:
                        retrieveProductDetailsForward(con);
                        break;
                    case 3:
                        retrieveProductDetailsReverse(con);
                        break;
                    case 4:
                        retrieveThirdRecordFromTop(con);
                        break;
                    case 5:
                        retrieveThirdRecordFromBottom(con);
                        break;
                    case 6:
                        con.close();
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void insertProductDetails(Connection con, Scanner scanner) throws Exception {
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter product price: ");
        int productPrice = scanner.nextInt();

        System.out.print("Enter product quantity: ");
        int productQty = scanner.nextInt();

        // Prepare the insert statement
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO Product VALUES (?, ?, ?, ?)");
        pstmt.setInt(1, productId);
        pstmt.setString(2, productName);
        pstmt.setInt(3, productPrice);
        pstmt.setInt(4, productQty);

        // Execute the insert statement
        int rowsInserted = pstmt.executeUpdate();
        System.out.println(rowsInserted + " row(s) inserted successfully.");
    }

    private static void retrieveProductDetailsForward(Connection con) throws Exception {
        PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Product");
        ResultSet rs = pstmt.executeQuery();

        System.out.println("Product Details (Forward):");
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("productId") +
                    ", Name: " + rs.getString("productName") +
                    ", Price: " + rs.getInt("productPrice") +
                    ", Quantity: " + rs.getInt("productQty"));
        }

        rs.close();
        pstmt.close();
    }

    private static void retrieveProductDetailsReverse(Connection con) throws Exception {
        PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Product ORDER BY productId DESC");
        ResultSet rs = pstmt.executeQuery();

        System.out.println("Product Details (Reverse):");
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("productId") +
                    ", Name: " + rs.getString("productName") +
                    ", Price: " + rs.getInt("productPrice") +
                    ", Quantity: " + rs.getInt("productQty"));
        }

        rs.close();
        pstmt.close();
    }

    private static void retrieveThirdRecordFromTop(Connection con) throws Exception {
        PreparedStatement pstmt = con.prepareStatement("SELECT * FROM (SELECT * FROM Product ORDER BY productId) WHERE ROWNUM <= 3");
        ResultSet rs = pstmt.executeQuery();

        System.out.println("Third record from top:");
        if (rs.next()) {
            System.out.println("ID: " + rs.getInt("productId") +
                    ", Name: " + rs.getString("productName") +
                    ", Price: " + rs.getInt("productPrice") +
                    ", Quantity: " + rs.getInt("productQty"));
        }

        rs.close();
        pstmt.close();
    }

    private static void retrieveThirdRecordFromBottom(Connection con) throws Exception {
        PreparedStatement pstmt = con.prepareStatement("SELECT * FROM (SELECT * FROM Product ORDER BY productId DESC) WHERE ROWNUM <= 3");
        ResultSet rs = pstmt.executeQuery();

        System.out.println("Third record from bottom:");
        if (rs.next()) {
            System.out.println("ID: " + rs.getInt("productId") +
                    ", Name: " + rs.getString("productName") +
                    ", Price: " + rs.getInt("productPrice") +
                    ", Quantity: " + rs.getInt("productQty"));
        }

        rs.close();
        pstmt.close();
    }
}

