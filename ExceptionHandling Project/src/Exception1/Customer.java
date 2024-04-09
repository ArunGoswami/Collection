package Exception1;

import java.io.Serializable;
import java.util.Scanner;

public class Customer implements Serializable{
	private Integer customerId;
	private String customerName;
	private Double customerBill;
	public Customer(Integer customerId, String customerName, Double customerBill) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}
	public static Customer getCustomerObject() {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the customerId");
		int customerId=scan.nextInt();
		
		System.out.println("Enter the customername");
		String customerName=scan.nextLine();
		customerName=scan.nextLine();
		System.out.println("Enter the customerbill");
		Double customerBill=scan.nextDouble();
		
		return new Customer(customerId, customerName, customerBill);
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}
	
	public Integer getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public Double getCustomerBill() {
		return customerBill;
	}
	
	public void setCustomerBill(Double customerBill) {
		this.customerBill = customerBill;
	}
	
}
