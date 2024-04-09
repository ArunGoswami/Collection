package day10;

import java.util.Scanner;

public class Roundedsum {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enetr the first number");
	int a=scan.nextInt();
	System.out.print("Enetr the second number");
	int b=scan.nextInt();
	System.out.print("Enetr the third number");
	int c=scan.nextInt();
	int result=Roundedsumof.getroundedsum(a,b,c);
	System.out.println(result);
}
}
class Roundedsumof{
	public static int getroundedsum(int a,int b,int c) {
		int r;
		return (a/10+(a%10)/5)*10+(b/10+(b%10)/5)*10+(c/10+(c%10)/5)*10;
	}
}