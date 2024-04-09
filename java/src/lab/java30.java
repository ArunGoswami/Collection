package lab;

import java.util.Scanner;

public class java30 {
    public static String isVowelConsonant(char ch) {
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'O' || ch == 'o' || ch == 'u' || ch == 'U') {
            return "vowel";
        } else {
            return "consonant";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        String result = isVowelConsonant(ch);
        System.out.println("The character is a " + result);
    }
}
