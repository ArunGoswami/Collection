package StringQuestion;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the String");
        int n = scan.nextInt();
        scan.nextLine(); 

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string " + (i + 1) + ":");
            str[i] = scan.nextLine();
        }

        System.out.println("Entered strings:");
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }

        System.out.println("Longest Common Prefix:");
//        for (int i = 0; i < str[0].length(); i++) {            //fghjk=5
//            char currentChar = str[0].charAt(i);               // cc=fghjk
//            for (int j = 1; j < n; j++) {                       // 1:n
//                if (i >= str[j].length() || str[j].charAt(i) != currentChar) {
//                    System.out.println(str[0].substring(0, i));
//                    System.exit(0);
//                }
//            }                          //4 fglk  5>=4 || fghi
//        }
//
//              System.out.println(str[0]);
        for(int i=0; i<str[0].length(); i++) {
        	char firststring=str[0].charAt(i);
        	for(int j=1; j<n; j++) {
        		if(i>=str[j].length() || str[j].charAt(i)!=firststring) {
        			System.out.println(str[0].substring(0,i));
        			break;
        		}
        	}
        }
        System.out.println(str[0]);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
