package File;

import java.util.Scanner;

public class reverseanumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int rev=0;
//	for(int r=n%10; n!=0; n=n/10) {  //3 2 1
//		rev=rev*10+r;
//	}
//	while(n!=0) {
//		int r=n%10; //7
//		rev=rev*10+r;//7
//		n/=10;//52
//	}
	System.out.println(rev);//7
}
}
