package StringQuestion;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
//	Scanner scan=new Scanner(System.in);
//	System.out.println("Enter the length of the String");
//	int n=scan.nextInt();
//	String[] str=new String[n];
//	for(int i=0; i<n; i++) {
//		str[i]=scan.nextLine();
//		
//	}
//	for(int i=0; i<n; i++) {
//		System.out.println(str[i]);
//		
//	}
	String str="ravi";
	String rev=" ";
	for(int i=str.length()-1; i>=0; i--) {
		rev=rev+str.charAt(i);	//
	}
	System.out.println(rev);
}
}
//	int i=0;
//	while(i>0) {
//		
//		System.out.println(str.charAt(i));
//		
//	}
//	System.out.println(str);
//}
//}
//
//}