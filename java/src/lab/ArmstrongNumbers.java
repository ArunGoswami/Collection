package lab;
public class ArmstrongNumbers {
    public static void amstrongPrinter(int number) {
        for (int i = 1; i <= number; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0;
        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, String.valueOf(num).length());
            originalNum /= 10;
        }

        return result == num;
    }

    public static void main(String[] args) {
        int n = 1000; // You can change the value of n as needed
        amstrongPrinter(n);
    }
}
while(temp>0)   
{       
last = temp % 10;   
sum +=  (Math.pow(last, digits));      
temp = temp/10;   
}  
