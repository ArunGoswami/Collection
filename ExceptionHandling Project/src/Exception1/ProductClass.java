package Exception1;

import java.util.Scanner;

public class ProductClass {
	String name;
	int availableQuantity;
	int price;
	public ProductClass(String name, int availableQuantity, int price) {
		super();
		this.name = name;
		this.availableQuantity = availableQuantity;
		this.price = price;
	}
	public void processOrder(int quantity, double totalamount) throws InvalidAmountException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the price");
		int price=scan.nextInt();
		System.out.println("Enetr the quantity");
		 quantity=scan.nextInt();
		 totalamount=price*quantity;
		 System.out.println("Enetr the totalamountpaid");
		int paidamount=scan.nextInt();
		if(totalamount!=paidamount) {
			throw new InvalidAmountException("amount is not paid");
		}
		else {
			System.out.println("amount paid");
		}
		if(quantity>=5) {
			throw new InsufficientQuantityException("InsufficientQuantityException is insufficient");
		}
		else {
			System.out.println("quantity is valid");
		}
	}
}
