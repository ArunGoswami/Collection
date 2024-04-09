package CollectionPackage;

import java.util.ArrayList;

import cabpackage.CabCustomer;
public class CabCustomerService {
ArrayList<CabCustomer> customerList=new ArrayList<CabCustomer>();
public void addCabCustomer(CabCustomer customer) {
    customerList.add(customer);
}

public boolean isFirstCustomer(CabCustomer customer) {
    for (CabCustomer existingCustomer : customerList) {
        if (existingCustomer.getPhone()==(customer.getPhone())) {
            return false;
        }
    }
    return true; 
}
public double calculateBill(CabCustomer customer) {
    if (isFirstCustomer(customer)) {
        return 0; 
    } else if (customer.getDistance() <= 4) {
        return 80; 
    } else {
        return 80 + 6 * (customer.getDistance() - 4); 
    }
}
public void printbill() {
	System.out.println(calculateBill(customer));
}
}

