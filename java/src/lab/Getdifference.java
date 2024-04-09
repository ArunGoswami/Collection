package lab;

import java.util.Scanner;

public class Getdifference {
	
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
    int result= TwoDigit.getsumdigit(n);
     System.out.println(result);
}
}
class TwoDigit{
	public static int getsumdigit(int n) {
		return	(n/10)-(n%10);
		}
}
