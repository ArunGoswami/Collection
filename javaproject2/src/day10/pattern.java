package day10;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nr = scan.nextInt();
        int r, c;

        for (r = 0; r < nr; r++) {
            int f1 = 0, f2 = 1, f3;

            for (c = 0; c < r; c++) {
                System.out.print(f1 + " ");
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}

