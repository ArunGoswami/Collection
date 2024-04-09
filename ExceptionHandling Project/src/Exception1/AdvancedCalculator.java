package Exception1;

public class AdvancedCalculator {
	
	public void performCalculation(String input) {
		try{
			System.out.println(input.length());
			int num=Integer.parseInt(input);
			System.out.println(num/0);
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException occured value is assigned");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException occured value is assigned");
		}
	}
}
