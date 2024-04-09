package StringQuestion;

import java.util.Scanner;

public class countvowel {
public static void main(String[] args) {
//	Scanner scan=new Scanner(System.in);
//	System.out.println("Enter the length of the String");
//	int n=scan.nextInt();
//	String[] str=new String[n];
//	for(int i=0; i<n; i++) {
//		str[i]=scan.next();
//		
//	}
//	for(int i=0; i<n; i++) {
//		System.out.println(str[i]);
//		
//	}
	String str="vhjaI6789i0#";
	int c=0;
	for(int i=0; i<str.length(); i++) {
		if((str.charAt(i)=='a') || (str.charAt(i)=='A') || (str.charAt(i)=='e')||
				(str.charAt(i)=='E') 
				|| (str.charAt(i)=='o') || (str.charAt(i)=='O') || 
				(str.charAt(i)=='u')||(str.charAt(i)=='U') || (str.charAt(i)=='i') ||
				(str.charAt(i)=='I') ) {
			c++;
			//System.out.println(c);
		}
	}
	System.out.println(c);
}
}
