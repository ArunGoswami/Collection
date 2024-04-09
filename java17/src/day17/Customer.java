package day17;

public class Customer {
	private String customerName;
	private int customerId;
	private String emailAddress;
	public Customer(String customerName, int customerId, String emailAddress) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.emailAddress = emailAddress;
	}
	public Customer(Customer customer) {
		super();
		this.customerName = customer.customerName;
		this.customerId = customer.customerId;
		this.emailAddress = customer.emailAddress;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void changeEmail(String emailAddress) {
		System.out.println(emailAddress);
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", emailAddress="
				+ emailAddress + "]";
	}
	
}
