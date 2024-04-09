package day10;

import java.util.Scanner;

public class factor {
	public static void isfactor(int n) {
		int i;
		for( i=1; i<=n; i++) {
			if(n%i==0) {
			System.out.println(i);
			}
		}
		
		
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
   isfactor(n);	
  // System.out.println(result);
}
}
