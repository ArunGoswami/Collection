package StringQuestion;

public class SentenceCase {
    public static void main(String[] args) {
        String str = "java is. a. platform";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || (str.charAt(i - 1) == '.' && str.charAt(i) == ' ') || (i + 1 < str.length() && Character.isLetter(str.charAt(i + 1)))) {
                System.out.print(Character.toUpperCase(str.charAt(i)));
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
}

