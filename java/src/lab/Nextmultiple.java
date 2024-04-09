package lab;

import java.util.Scanner;

public class Nextmultiple {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	n=(n/100+1)*100;
	System.out.print(n);
}
}
