package Test;

public class Bank extends Thread {
	public int initialBalnce=4000;
	public Bank(int initialBalnce) {
		this.initialBalnce =initialBalnce;
	}
	public void withdraw(int withdraw) throws InterruptedException {
		if(this.initialBalnce<=withdraw) {
			System.out.println("Amount is less");
			//deposit(1000);
			Thread.sleep(5000);
			
			initialBalnce-=withdraw;
			System.out.println("Remaining amount is"+initialBalnce);
		}
	}
	public void deposit(int deposit) {
		initialBalnce+=deposit;
		System.out.println(deposit);
	}
}
