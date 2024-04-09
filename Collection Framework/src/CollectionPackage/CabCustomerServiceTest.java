package CollectionPackage;

public class CabCustomerServiceTest {
public static void main(String[] args) {
	CabCustomerService cab=new CabCustomerService();
	
	CabCustomer j=new CabCustomer(1, "johny", "indore", "bhopal", "150", 0);
	cab.addCabCustomer(j);
	cab.printbill();
}
}
