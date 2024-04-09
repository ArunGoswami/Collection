package StringQuestion;

public class RomanToDecimalConverter {
    public static void main(String[] args) {
        String romanNumeral = "XIV"; // You can replace this with the Roman numeral you want to convert
        int decimalValue = romanToDecimal(romanNumeral);
        System.out.println("The decimal value of " + romanNumeral + " is: " + decimalValue);
    }

    public static int romanToDecimal(String str) {
        int ans = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            int n1 = convert(str.charAt(i));
            int n2 = convert(str.charAt(i + 1));

            if (n1 >= n2)
                ans += n1;
            else
                ans -= n1;
        }

        ans += convert(str.charAt(str.length() - 1));

        return ans;
    }

    public static int convert(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return -1;
    }
}

