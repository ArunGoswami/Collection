package interfacePackage2;

public  class MyCalculator implements AdvancedAirthmetic  {

	@Override
	public int divisorSum(int n) {
		int r=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				r+=i;
			}
		}
		return r;
	}
	 

}
