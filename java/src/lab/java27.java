package lab;

import java.util.Scanner;

public class java27 {
    public static boolean isPalindrome(int n, int rev) {
        if (n == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = n;
        int rev = 0;
        while (t != 0) {
            rev = rev * 10 + t % 10;
            t /= 10;
        }
        boolean result = isPalindrome(n, rev);
        System.out.println("Is Palindrome? " + result);
    }
}
