package JDBCPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;

public class InsertEmployee {
    public static void main(String[] args) {
        try {
            // Establishing database connection
            Connection con = DriverManager.getConnection("jdbc:oracle:oci8:@XE", "System", "oracle");
            System.out.println("Connection established");

            // Input employee details
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Enter Employee Name: ");
            String empName = scanner.nextLine();

            System.out.print("Enter Employee Address: ");
            String empAddress = scanner.nextLine();

            System.out.print("Enter Employee Mail ID: ");
            String empMailId = scanner.nextLine();

            System.out.print("Enter Employee Phone Number: ");
            String empPhNo = scanner.nextLine();

            System.out.print("Enter path to Employee Resume file: ");
            String resumePath = scanner.nextLine();

            // Read resume content from file
            File resumeFile = new File(resumePath);
            File f=new File(resumePath);
            FileReader reader = new FileReader(resumeFile);
            FileReader fr=new FileReader(f);
            char[] resumeContent = new char[(int) resumeFile.length()];
            char[] content=new char[(int)f.length()];
            reader.read(resumeContent);
            reader.read(content);
            String emor=new String(content);
            String empResume = new String(resumeContent);
            reader.close();

            // Prepare the insert statement
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO emp_info VALUES (?, ?, ?, ?, ?, ?)");
            pstmt.setInt(1, empId);
            pstmt.setString(2, empName);
            pstmt.setString(3, empAddress);
            pstmt.setString(4, empMailId);
            pstmt.setString(5, empPhNo);
            pstmt.setString(6, empResume);

            // Execute the insert statement
            int rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted successfully.");

            // Closing resources
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
