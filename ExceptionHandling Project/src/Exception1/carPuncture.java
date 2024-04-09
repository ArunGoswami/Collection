package Exception1;

public class carPuncture  extends Exception
{
	carPuncture(){
		
	}
	carPuncture(String message){
		super(message);
	}
	public static void puncture(String value) {
		if(value=="punctured") {
			throw new carPuncture("car puncture");
		}
		else {
			System.out.println(" Car not stall");
		}
}
