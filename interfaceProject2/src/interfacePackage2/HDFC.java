package interfacePackage2;

public class HDFC implements Bank {
	static double bankamount;
	@Override
	public void depositing(double amount) {
		
		 bankamount=bankamount+amount;
		 System.out.println("amount is"+bankamount);
		
		
	}
	@Override
	public void withdrawing(double amount) {
	
		bankamount=bankamount-amount;
		 System.out.println("hdfc amount is"+bankamount);
		
	}

	@Override
	public void accountbalance() {
	
		System.out.println("amount is"+bankamount);
		
	}

}
