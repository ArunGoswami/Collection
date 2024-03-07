package CollectionPackage2;

import java.beans.Customizer;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class GasBookingService {
ArrayList<GasCustomer> gasCustomers=new ArrayList<GasCustomer>();

public GasBookingService(ArrayList<GasCustomer> gasCustomers) {
	super();
	this.gasCustomers = gasCustomers;
}
public void add(GasCustomer gasCustomer) {
	gasCustomers.add(gasCustomer);
}
public boolean isFirstCustomer(GasCustomer gasCustomer) {

    for (GasCustomer existingCustomer : gasCustomers) {
        if (existingCustomer.getPhoneNumber().equals(gasCustomer.getPhoneNumber())) {
            return true; 
        }
    }
    return false; 
}
public int calculateBill(GasCustomer gasCustomer) {
	
	if(isFirstCustomer(gasCustomer)) {
		return 800;
	}
	else {
		return 200;
	}
	
} 
//public void printbill() {
//	int amount=calculateBill(gasCustomers);
//	System.out.println(bill);
//}
}
