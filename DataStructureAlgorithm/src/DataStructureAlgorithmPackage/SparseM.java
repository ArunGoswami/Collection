package DataStructureAlgorithmPackage;

import java.util.Scanner;

public class SparseM {
    public static void main(String[] args) {
        int i = 0, j = 0;
        Scanner scan = new Scanner(System.in);

        // Input matrix dimensions
        int n = scan.nextInt();
        int m = scan.nextInt();

        // Input matrix
        int arr[][] = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        // Display original matrix
        System.out.println("Original Matrix:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Count non-zero elements
        int nonZeroCount = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (arr[i][j] != 0) {
                    nonZeroCount++;
                }
            }
        }

        // Create sparse matrix
        int sparseMatrix[][] = new int[nonZeroCount][3];
        int k = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (arr[i][j] != 0) {
                    sparseMatrix[k][0] = i;
                    sparseMatrix[k][1] = j;
                    sparseMatrix[k][2] = arr[i][j];
                    k++;
                }
            }
        }

        // Display sparse matrix
        System.out.println("Sparse Matrix:");
        for (i = 0; i < nonZeroCount; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(sparseMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
