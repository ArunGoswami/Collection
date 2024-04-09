package interfacePackage2;

public class MobilePhoneclass implements MobilePhoneInterface{

	@Override
	public void inserting(SIMCardInterface sim) // new Jio() , new Airtel() , new BSLN() 
	{
		sim.activationdeactivation();
		sim.networkprovider();
		sim.phonenumber();
	}

	@Override
	public void removing(SIMCardInterface sim) {
		sim.activationdeactivation();
	}

	@Override
	public void calls(SIMCardInterface sim) {
		sim.networkprovider();
		System.out.println("is calling");
	}

	@Override
	public void texts(SIMCardInterface sim) {
		sim.
		
	}



}
