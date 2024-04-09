package lab;

import java.util.Scanner;

public class java25 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double f=scan.nextDouble();
	double c=(f-32)*5/9;
	System.out.println(c);		
	double ce=scan.nextDouble();
	double fa=((9*c)/5)/9;
	System.out.println(fa);
}
}
