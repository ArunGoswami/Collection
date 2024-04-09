package StringQuestion;

public class RomanConverter {
    public static void convertToRoman(int n) {
        // Define the symbols and their corresponding values in descending order
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder romanNumeral = new StringBuilder();

        // Loop through the values and build the Roman numeral
        int i = 0;
        while (n > 0) {
            // Check if the current value is less than or equal to n
            if (values[i] <= n) {
                romanNumeral.append(symbols[i]);
                n -= values[i];
            } else {
                // Move to the next symbol and value
                i++;
            }
        }

        System.out.println(romanNumeral.toString());
    }

    public static void main(String[] args) {
        // Example usage:
        convertToRoman(5);  // Output: V
        convertToRoman(3);  // Output: III
    }
}
