package interfacePackage2;


public class Airtel implements SIMCardInterface {

	@Override
	public void phonenumber() {
		System.out.println("no is 12345679");		
	}

	@Override
	public void networkprovider() {
		System.out.println("networkprovider is airtel");
		
	}

	@Override
	public void activationdeactivation() {
		System.out.println("sim is activated");
		
	}



}
