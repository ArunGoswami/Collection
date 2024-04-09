package JDBCPackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OnlineBankingSystem {

    // JDBC connection parameters
    private static final String JDBC_URL = "jdbc:oracle:oci8:@XE";
    private static final String USERNAME = "System";
    private static final String PASSWORD = "oracle";

    public static void main(String[] args) {
        // Initialize transfer parameters
        int senderAccount = 123456;
        int receiverAccount = 654321;
        double transferAmount = 500.0;

        try {
            // Establish database connection
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            System.out.println("Database connection established.");

            // Start transaction
            connection.setAutoCommit(false);

            // Check sender's balance
            double senderBalance = getAccountBalance(connection, senderAccount);
            if (senderBalance < transferAmount) {
                System.out.println("Insufficient funds in the sender's account.");
                return;
            }

            // Deduct transfer amount from sender's account
            updateAccountBalance(connection, senderAccount, senderBalance - transferAmount);

            // Credit transfer amount to receiver's account
            double receiverBalance = getAccountBalance(connection, receiverAccount);
            updateAccountBalance(connection, receiverAccount, receiverBalance + transferAmount);

            // Commit transaction
            connection.commit();
            System.out.println("Transfer successful!");

        } catch (SQLException e) {
            System.err.println("Transaction failed. Rolling back changes...");
            try {
                if (e.getNextException() != null) {
                    e.getNextException().printStackTrace();
                }
                // Rollback transaction
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException rollbackException) {
                rollbackException.printStackTrace();
            }
        } finally {
            // Close database connection
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Database connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to retrieve account balance
    private static double getAccountBalance(Connection connection, int accountNumber) throws SQLException {
        PreparedStatement pstmt = connection.prepareStatement("SELECT balance FROM accounts WHERE account_number = ?");
        pstmt.setInt(1, accountNumber);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            return rs.getDouble("balance");
        } else {
            throw new SQLException("Account number not found.");
        }
    }

    // Method to update account balance
    private static void updateAccountBalance(Connection connection, int accountNumber, double newBalance) throws SQLException {
        PreparedStatement pstmt = connection.prepareStatement("UPDATE accounts SET balance = ? WHERE account_number = ?");
        pstmt.setDouble(1, newBalance);
        pstmt.setInt(2, accountNumber);
        pstmt.executeUpdate();
    }
}
