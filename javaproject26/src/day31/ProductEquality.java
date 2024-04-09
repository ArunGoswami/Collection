package day31;

public class ProductEquality {
	public static void main(String[] args) {
		Product p1 = new Product(111, "sonu");
		Product p2 = new Product(111, "sonu");
		System.out.println(p1.equals(p2));

	}
}
