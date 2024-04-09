package interfacePackage2;

public class ICICI implements Bank {
	static double amount;
	@Override
	public void depositing(double amount) {
		int bal = 0;
		 amount=amount+bal;
		 System.out.println("icici amount is"+amount);
		
		
	}

	@Override
	public void withdrawing(double amount) {
		int bal = 0;
		 amount=amount-bal;
		 System.out.println("amount is"+amount);
		
	}

	@Override
	public void accountbalance() {
		int amount = 0;
		System.out.println("amount is"+amount);
		
	}

}
