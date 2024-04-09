package File;
import java.util.Scanner;

class Discount {

    public static void phoneDiscount(String oldPhone, String newPhone,
    		int ageOfOldPhone, double newPhonePrice) {
       System.out.println("disount on phone");
    	if (ageOfOldPhone == 1) {
            System.out.println(0.2 * newPhonePrice);
        } else if (ageOfOldPhone > 1 && ageOfOldPhone <= 2) {
            System.out.println(0.35 * newPhonePrice);
        } else if (ageOfOldPhone > 2 && ageOfOldPhone <= 3) {
            System.out.println(0.50 * newPhonePrice);
        } else {
            System.out.println(0.6 * newPhonePrice);
        }
    	
    }
  
}

public class FlipCartSale {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the old phone model: ");
        String oldPhone = scan.nextLine();
        
        System.out.println("Enter the new phone model: ");
        String newPhone = scan.nextLine();
        
        System.out.println("Enter the age of the old phone (in years): ");
        int ageOfOldPhone = scan.nextInt();
        
        System.out.println("Enter the price of the new phone: ");
        double newPhonePrice = scan.nextDouble();

        Discount.phoneDiscount(oldPhone, newPhone, ageOfOldPhone, newPhonePrice);
        
    }
}
