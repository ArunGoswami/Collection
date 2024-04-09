package StringQuestion;

import java.util.Scanner;

public class SortingString {
    public static void main(String[] args) {
        int i, j;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the String");
        int n = scan.nextInt();
        // Consume the newline character after reading the integer
        scan.nextLine();

        String[] str = new String[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter string " + (i + 1) + ":");
            str[i] = scan.nextLine();
        }

        System.out.println("Original strings:");
        for (i = 0; i < n; i++) {
            System.out.println(str[i]);
        }

        for (i = 0; i < str.length; i++) {
            for (j = i + 1; j < str.length; j++) {
                if (str[i].charAt(0) > str[j].charAt(0)) {
                    // Swap the strings
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.println("Sorted strings based on the first character:");
        for (i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
    }
}

