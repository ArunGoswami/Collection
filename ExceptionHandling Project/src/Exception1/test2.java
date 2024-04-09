package Exception1;

public class test2 {
public static void main(String[] args) {
	ProductClass laptop=new ProductClass("laptop", 50000, 5);
	try {
	laptop.processOrder(50, 5);
	}
	catch(InvalidAmountException e) {
		System.out.println("InvalidAmountException occured");
	}
	catch(InsufficientQuantityException e) {
		System.out.println("InvalidAmountException occured");
	}
}
}
