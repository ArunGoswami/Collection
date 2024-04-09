package interfacePackage2;

public interface Hospital {
	void admitPatient(String patientName, Address address);
	void provideTreatment(String patientName);
	void generateBill(String patientName, double amount);
}
