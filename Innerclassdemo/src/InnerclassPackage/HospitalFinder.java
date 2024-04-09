package InnerclassPackage;

public class HospitalFinder {
public static void main(String[] args) {
	HospitalService hospitalService=new HospitalService();
	hospitalService.getHospitals();
	hospitalService.getHospitalDetails("1234");
}
}
