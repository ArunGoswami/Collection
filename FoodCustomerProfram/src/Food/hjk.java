package Food;


import java.util.ArrayList;
 class FoodCustomer {
    private int customerId;
    private String customerName;
    private String address;
    private int phoneNumber;

    public FoodCustomer(int customerId, String customerName, String address, int phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the phoneNumber
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}


	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
    public String toString() {
        return "FoodCustomer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
                + ", phoneNumber=" + phoneNumber + "]";
    }
}




class FoodOrderService {
    private ArrayList<FoodCustomer> customers;

    public FoodOrderService() {
        this.customers = new ArrayList<>();
    }

    public ArrayList<FoodCustomer> placeOrder(FoodCustomer customer) {
        customers.add(customer);
        return customers;
    }

    public boolean isFirstTimeCustomer(FoodCustomer customer) {
        for (FoodCustomer existingCustomer : customers) {
            if (existingCustomer.getPhoneNumber() == customer.getPhoneNumber()) {
                return false; // Customer already exists
            }
        }
        return true; // New customer
    }

    public int calculateBill(int order, int baseDelivery) {
        if (order == 1) {
            return 0; // No charge for the first order
        } else {
            return baseDelivery;
        }
    }

    public void printBill(int order, int baseDelivery) {
        int totalBill = calculateBill(order, baseDelivery);
        System.out.println("Total Bill: " + totalBill);
    }
}



public class FoodCustomerProgramOneFile {
    public static void main(String[] args) {
        FoodOrderService foodOrderService = new FoodOrderService();
        FoodCustomer customer = new FoodCustomer(1, "anu", "bhopal", 123456);

        foodOrderService.placeOrder(customer);

        if (foodOrderService.isFirstTimeCustomer(customer)) {
            System.out.println("First time customer");
        } else {
            System.out.println("Returning customer");
        }

        int orderCount = 2; // Example order count
        int baseDeliveryCharge = 300; // Example delivery charge

        foodOrderService.printBill(orderCount, baseDeliveryCharge);
    }
}
