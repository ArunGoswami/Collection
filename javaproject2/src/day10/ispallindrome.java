package day10;

import java.util.Scanner;

public class ispallindrome {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    for(int i=1; i<=n; i++) {
    	pallindrome.printpallindrome(i);
    }
    
}
}
class pallindrome{
	public static boolean ispallindrome(int n) {
		int t=n;
		int rev=0;
		while(t!=0) {
			rev=rev*10+t%10;
			t/=10;
		}
		return n==rev;
	}
	public static void printpallindrome(int n) {
		if(ispallindrome(n)==true) {
			System.out.println(n);
		}
	}
}