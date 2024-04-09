package lab;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	while(n!=0) {
	int r=n%10;
	n/=10;
	Math.pow(n, r);
	}
}
}
