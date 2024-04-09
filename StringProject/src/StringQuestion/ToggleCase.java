package StringQuestion;

public class ToggleCase {
    public static void main(String[] args) {
        String str = "java is a platform";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || (str.charAt(i - 1) == ' ' && str.charAt(i) != ' ')) {
                System.out.print( (str.charAt(i)));
            } else {
                System.out.print((char)(str.charAt(i)-32));
            }
        }
    }
}

