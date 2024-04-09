package day31;

public class Product {
	private int productId;
	private String productName;

	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public boolean equals(Object obj) {
		Product p2 = (Product) obj;
		if(obj instanceof Product) {
			
		
		if (this.productId == p2.productId && this.productName.equals(p2.productName)) {
			return true;
		}
		return false;
	}
		else {
			System.out.println("not comparable");
		}
		return false;
	}
}
