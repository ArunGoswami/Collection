package day24;

public class Aadhar {
private int aadharId;
private String authority;
public Aadhar(int aadharId, String authority) {
	super();
	this.aadharId = aadharId;
	this.authority = authority;
}
@Override
public String toString() {
	return "Aadhar [aadharId=" + aadharId + ", authority=" + authority + "]";
}

}
