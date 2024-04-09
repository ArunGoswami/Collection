package Exception;

import java.util.Scanner;
import java.util.function.Predicate;

public class Predefine {
public static void main(String[] args) {
	Predicate<Integer> pre=num->num%2==0;
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	System.out.println(pre.test(num));
}
}
