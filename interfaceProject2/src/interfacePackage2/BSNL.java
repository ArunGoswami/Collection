package interfacePackage2;

public class BSNL implements SIMCardInterface  {

	@Override
	public void phonenumber() {
		System.out.println("no is 1123456789");
		
	}

	@Override
	public void networkprovider() {
		System.out.println("networkprovider is bsnl");
		
	}

	@Override
	public void activationdeactivation() {
		System.out.println("sim is ndeactivated");
		
	}

}
