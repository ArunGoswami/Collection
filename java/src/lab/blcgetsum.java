package lab;

import java.util.Scanner;

public class blcgetsum {
	public static int getsumdigit(int n) {
	return	(n%10)+(n/10);
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
    int result= getsumdigit(n);
     System.out.println(result);
}
}
