package CollectionPackage2;

import java.util.ArrayList;

public class GasBookingServiceTeste {
public static void main(String[] args) {
	GasBookingService gasBookingService=new GasBookingService(new ArrayList<GasCustomer>());
	GasCustomer john=new GasCustomer(1, "john", "bhopal", "12234");
	GasCustomer johnwick=new GasCustomer(1, "johnwick", "bhopal", "12234");
	gasBookingService.add(johnwick);
	System.out.println(gasBookingService.isFirstCustomer(johnwick));
	System.out.println(gasBookingService.calculateBill(johnwick));
	gasBookingService.add(john);
	System.out.println(gasBookingService.isFirstCustomer(john));
	System.out.println(gasBookingService.calculateBill(john));	
}
}
