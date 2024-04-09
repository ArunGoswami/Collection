package DataStructureAlgorithmPackage;
import java.util.Scanner;

public class SymmetricMatrix {

    public static void main(String[] args) {
        int i, j;
        Scanner scan = new Scanner(System.in);

        // Input matrix dimensions
        System.out.println("Enter the number of rows and columns:");
        int n = scan.nextInt();
        int m = scan.nextInt();

        int arr[][] = new int[n][m];

        // Input matrix elements
        System.out.println("Enter the matrix elements:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("Original Matrix:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Check and display the upper triangular matrix
        System.out.println("Symmetric Matrix:");
        boolean symmetric = true;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (arr[i][j] != arr[j][i]) {
                    symmetric = false;
                    break;
                }
            }
            if (!symmetric) {
                break;
            }
        }

        if (symmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}
