package day18;

import java.util.Scanner;

public class vote {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int a=n>17?0:1;
	switch(a) {
	case 0:
	System.out.println("eligible to vote");
	break;
	case 1:
	System.out.println("not eligible to vote");
	break;
	}
}
}
