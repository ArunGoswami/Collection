package lab;

import java.util.Scanner;

public class Fibonacc {
    public static void fibonacci(int n) {
        int f1 = 0, f2 = 1,f3=0;
        for (int i = 0; i < n; i++) {
            System.out.println(f1);
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        fibonacci(n);
    }
}
