package interfacePackage2;

import java.util.Scanner;

public class test {
public static void main(String[] args) {
	MyCalculator m=new MyCalculator();
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scan.nextInt();
	System.out.println(m.divisorSum(n));
}
}
