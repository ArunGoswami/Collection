package lab;

import java.util.Scanner;

public class java28 {
    public static int oddeven(int n) {
        if (n%2== 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = oddeven(n);
        System.out.println("Is oddeven? " + result);
    }
}
