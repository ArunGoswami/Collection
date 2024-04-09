package lab;
public class PatternCreator {
    public static String patternCreator(int row, int col) {
        StringBuilder pattern = new StringBuilder();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                pattern.append(j).append(" ");
            }
            pattern.append("\n");
        }
        return pattern.toString();
    }

    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        String result = patternCreator(row, col);
        System.out.println(result);
    }
}