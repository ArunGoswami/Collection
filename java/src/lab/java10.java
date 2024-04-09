package lab;

public class java10 {
public static void main(String [] args ) {
	int coffee=10;
	int tea=10;
	int biscuit=10;
	System.out.println("Enter the item");
	int coffeeq=Integer.parseInt(args[0]);
	System.out.println("Enter the price");
	int biscuitq=Integer.parseInt(args[1]);
	System.out.println("Enter the quantity");
	int teaq=Integer.parseInt(args[2]);
	int total=biscuitq*biscuit+coffeeq*coffee+tea*teaq;
	System.out.println(total);
}
}
