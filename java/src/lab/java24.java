package lab;

import java.util.Scanner;

public class java24 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	 p=scan.nextInt();
	double r=scan.nextInt();
	double ci=p*(1+r/100)*(1+r/100)*(1+r/100);
	System.out.println(ci);
}

}
