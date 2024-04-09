package lab;

import java.util.Scanner;

public class java19 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int m=scan.nextInt();
	int p=scan.nextInt();
	int c=scan.nextInt();
	int h=scan.nextInt();
	int e=scan.nextInt();
	int total=m+p+c+h+e;
	int avg=total/5;
	System.out.println(avg);
	if(avg>60) {
		System.out.println("pass");
		}
	else {
		System.out.println("fail");
	}
	
}
}
