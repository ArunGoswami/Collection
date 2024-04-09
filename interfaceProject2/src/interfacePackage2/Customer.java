package interfacePackage2;

public class Customer {
	String name;
	double accountBalance;
	public Customer(String name, double accountBalance) {
		super();
		this.name = name;
		this.accountBalance = accountBalance;
	}
	public void deposit(Bank bank, double amount) {
		
		bank.depositing(5000);
		
	}
public void withdraw(Bank bank, double amount) {
	bank.withdrawing(2000);
	}
public void checkBalance(Bank bank) {
	bank.accountbalance();
}
}
