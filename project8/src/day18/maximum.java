package day18;

import java.util.Scanner;

public class maximum {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int m=scan.nextInt();
	
	int a=n>m?1:0;
	switch(a) {
	case 1:
	System.out.println("n is greater");
	break;
	case 0:
		System.out.println("m is greater");
		break;
	}
}
}
