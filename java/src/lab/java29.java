package lab;

import java.util.Scanner;

public class java29 {
    public static int addition(int n, int m) {
    
    	return n+m;
    }
    public static int sub(int n, int m) {
        
    	return n-m;
    }
    public static int multiply(int n, int m) {
        
    	return n*m;
    }
    public static int div(int n, int m) {
        
    	return n/m;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int result = addition(n, m);
        System.out.println("addition is " + result);
        int resul = sub(n, m);
        System.out.println("addition is " + resul);
        int resu = multiply(n, m);
        System.out.println("addition is " + resu);
        int res = div(n, m);
        System.out.println("addition is " + res);
    }
}

