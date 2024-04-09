package lab;

public class java9 {
public static void main(String [] args ) {
	System.out.println("Enter the item");
	String item=args[0];
	System.out.println("Enter the price");
	int price=Integer.parseInt(args[1]);
	System.out.println("Enter the quantity");
	int quantity=Integer.parseInt(args[2]);
	int total=price*quantity;
	System.out.println(total);
}
}
