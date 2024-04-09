package day26;
import java.util.Scanner;

public class Customer {
private int customerId;
private String customerName;
private int customerNu;
public Customer(int customerId, String customerName, int customerNu) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerNu = customerNu;
}
public static Customer getcustomer() {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter");
	int customerId =scan.nextInt();
	System.out.println("enter");
	String customerName =scan.next();
	scan.next();
	
	System.out.println("enter");
	int customerNu =scan.nextInt();
	
	return new Customer(customerId,customerName,customerNu);
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerNu=" + customerNu + "]";
}

public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
    for(int i=1; i<n; i++) {
    	Customer c=Customer.getcustomer();
    	System.out.println(c);
    }
}
}
