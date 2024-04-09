package lab;

import java.util.Scanner;

public class java31 {
    public static int isprimenumber(int n) {
     int c=0;
    	for(int i=1; i<=n; i++) {
    	if(n%i==0) {
    		c++;
    	}
    	}
    	if(c==2) {
    		return 1;
    	}
    	else {
    		return 0;
    	}
    }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int  result = isprimenumber(n);
        System.out.println("The character is a " + result);
    }
}

