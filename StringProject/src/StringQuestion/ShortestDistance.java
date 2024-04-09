package StringQuestion;

import java.util.Scanner;

public class ShortestDistance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the String");
        int n = scan.nextInt();
        scan.nextLine(); // Consume the newline character

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scan.next(); // Use next() instead of nextLine() to read individual words
        }

        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
System.out.println("Enter the first string");
        String str1 = scan.next();
        String str2 = scan.next();
        int c = 0;
//        for(int i=0; i<str[0].length(); i++) {      //
//        	int stringlength=str[0].length();
//            for(int j=1; j<n; j++) {
//                if(str[j].length()==stringlength) {
//                	c++;
//                }
//            }
//        }
//        System.out.println(c);
        for(int i=0; i<n; i++) {                 //  
        	
        }
    }
}
