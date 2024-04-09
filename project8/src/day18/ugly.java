package day18;

import java.util.Scanner;

public class ugly {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   int x=0;
  while(n!=1) {
	  if(n%5==0) {
		  n/=5;
	  }

	  else if(n%2==0) {
		  n/=2;
	  }
	  
	  else if(n%3==0) {
		  n/=3;
		  x=1;
		  break;
	  }
  }
  if(x==0) {
	  System.out.println("not ugly");
	  
  }
  else {
	  System.out.println("ugly");
  }
}
}
