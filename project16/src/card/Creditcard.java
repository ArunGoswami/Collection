package card;

public class Creditcard {
private int creditpoints;
private String customerName;
public Creditcard(int creditpoints, String customerName) {
	super();
	this.creditpoints = creditpoints;
	this.customerName = customerName;
}
public int creditcard() {
	return this.creditpoints;
}

@Override
public String toString() {
	return this.customerName;
}


}
