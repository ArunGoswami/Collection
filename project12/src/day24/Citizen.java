package day24;

public class Citizen {
private String citizenName;
private String citizenaddress;
private char gender;
public Citizen(String citizenName, String citizenaddress, char gender) {
	super();
	this.citizenName = citizenName;
	this.citizenaddress = citizenaddress;
	this.gender = gender;
}
@Override
public String toString() {
	return "citizen [citizenName=" + citizenName + ", \ncitizenaddress=" + citizenaddress + ", gender=" + gender + "]";
}

}
