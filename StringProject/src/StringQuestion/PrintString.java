package StringQuestion;

import java.util.Scanner;

public class PrintString {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the length of the String");
	int n=scan.nextInt();
	String[] str=new String[n];
	for(int i=0; i<n; i++) {
		str[i]=scan.nextLine();
		
	}
	for(int i=0; i<n; i++) {
		System.out.println(str[i]);
		
	}
}
}
