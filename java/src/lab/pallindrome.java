package lab;

import java.util.Scanner;

public class pallindrome {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int m=n;
	int rev=0;
	while(n!=0) {
		rev=rev*10+n%10;
		n/=10;
	}
	if(n==rev) {
		System.out.println("pallindrome");
	}
	else {
		System.out.println("Not a pallindrome");
	}
}
}
