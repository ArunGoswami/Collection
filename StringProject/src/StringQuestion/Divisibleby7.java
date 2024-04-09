package StringQuestion;

import java.util.Scanner; 

public class Divisibleby7 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
	  while(n>9) {
		   int r=n%10;
		   n/=10;
		   n=n-(2*r);
		   System.out.println(n);//divisible by 7
	  }
	  System.out.println(n/7);
}                                                        //371 =37-(2*1);
}                                                        //35=3-(2*5)=-7
