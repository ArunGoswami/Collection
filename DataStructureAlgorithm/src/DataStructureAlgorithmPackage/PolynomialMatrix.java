package DataStructureAlgorithmPackage;

package DataStructureAlgorithmPackage;

import java.util.Scanner;

public class PolynomialMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input the degree of the polynomial
        System.out.println("Enter the degree of the polynomial:");
        int degree = scan.nextInt();

        // Initialize the matrix for polynomial representation
        int[][] polynomialMatrix = new int[degree + 1][2];

        // Input coefficients and exponents
        System.out.println("Enter the coefficients and exponents of the polynomial (from highest degree to constant term):");
        for (int i = degree; i >= 0; i--) {
            System.out.println("Coefficient for x^" + i + ": ");
            polynomialMatrix[i][0] = scan.nextInt();
            polynomialMatrix[i][1] = i;
        }

        // Display the polynomial
        System.out.println("Polynomial Representation:");
        displayPolynomialMatrix(polynomialMatrix);

        // Evaluate the polynomial for a specific value
        System.out.println("Enter the value to evaluate the polynomial:");
        int x = scan.nextInt();
        int result = evaluatePolynomialMatrix(polynomialMatrix, x);
        System.out.println("Result of polynomial evaluation at x = " + x + ": " + result);
    }

    // Function to display the polynomial matrix
    private static void displayPolynomialMatrix(int[][] polynomialMatrix) {
        for (int i = 0; i < polynomialMatrix.length; i++) {
            System.out.println("Coefficient for x^" + polynomialMatrix[i][1] + ": " + polynomialMatrix[i][0]);
        }
    }

    // Function to evaluate the polynomial for a specific value
    private static int evaluatePolynomialMatrix(int[][] polynomialMatrix, int x) {
        int result = 0;
        for (int i = 0; i < polynomialMatrix.length; i++) {
            result += polynomialMatrix[i][0] * Math.pow(x, polynomialMatrix[i][1]);
        }
        return result;
    }
}
