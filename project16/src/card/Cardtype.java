package card;

public class Cardtype {
private Creditcard customer;
private String cardType;
public Cardtype(Creditcard customer, String cardType) {
	super();
	this.customer = customer;
	this.cardType = cardType;
}
@Override
public String toString() {
	return "Cardtype [customer=" + customer + ", cardType=" + cardType + "]";
}

}
