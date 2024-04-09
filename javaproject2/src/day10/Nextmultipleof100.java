package day10;

import java.util.Scanner;

public class Nextmultipleof100 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=scan.nextInt();
	int result=Multipleof100.multiple(n);
	System.out.println(result);
}
}
 class Multipleof100 {
	public static int multiple(int n) {
		return (n/100+1)*100;
	}
}
