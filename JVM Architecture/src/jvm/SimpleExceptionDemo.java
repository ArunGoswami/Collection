package jvm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int m = scan.nextInt();
            System.out.println(n + m);
        } catch (InputMismatchException e) {
            System.err.println("Input is mismatch");
            e.printStackTrace();
            e.toString();
           e.getMessage();
           
        }
    }
}

