package lab;

import java.util.Scanner;

public class primefactor {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	for(int i=2; i<n; i++) {
		while(n%i==0) {
			System.out.println(i);
			n/=i;
		}
	}
	if(n>2) {
		System.out.println(n);
	}
   
}
}
