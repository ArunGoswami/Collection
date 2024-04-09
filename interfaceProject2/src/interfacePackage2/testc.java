package interfacePackage2;

public class testc {
public static void main(String[] args) {
	Patient p=new Patient();
	Address a=new Address("Bhopal","harsh" , "mp", "india");
//	p.admitPatient("A", a);
//	p.generateBill(null, 0);
//	p.provideTreatment(null);
	Disease d=new Disease();
	d.diseasename(new Cardiology());
}
}
