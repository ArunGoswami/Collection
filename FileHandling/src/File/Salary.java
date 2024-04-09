package File;
import java.util.Scanner;

class SalaryCalculation {
    public static int moneySpend(int food, int activities, int salary) {
        food = salary / 2;
        activities = (int) (0.1 * salary); 
        int totalSpend = food + activities;
        return totalSpend;
    }

    public static void moneySaved(int salary, int spend) {
        int moneySaved = salary - spend;
        System.out.println(moneySaved);
    }
}

public class Salary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = scan.nextInt();

        int food = salary / 2;
        int activities = (int) (0.1 * salary); 
        int spend = SalaryCalculation.moneySpend(food, activities, salary);

        System.out.println("Total spend: " + spend);
        SalaryCalculation.moneySaved(salary, spend);
    }
}
