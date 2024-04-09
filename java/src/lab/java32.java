package lab;

import java.util.Scanner;

public class java32 {
    public static String isVowelConsonant(char ch) {
        if (ch>='a' && ch<='z') {
            return "alphabet";
        } else {
            return "not al[phabet";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        String result = isVowelConsonant(ch);
        System.out.println("The character is a " + result);
    }
}
