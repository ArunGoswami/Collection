package Inter;

 interface Bank {
  void deposit();
  void withdraw();
 
}
class customer implements Bank{

	@Override
	public void deposit() {
		System.out.println("deposit");		
	}

	@Override
	public void withdraw() {
	System.out.println("withdraw");
		
	}
	
}
