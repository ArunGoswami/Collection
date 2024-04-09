package lab;

import java.util.Scanner;

public class java33 {
    public static void primefactor(int num) {
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.println(i);
                num /= i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        primefactor(num);
    }
}

