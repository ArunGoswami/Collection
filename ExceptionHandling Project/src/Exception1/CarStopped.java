package Exception1;

public class CarStopped  extends Exception
 {
	CarStopped(){
		
	}
	CarStopped(String message){
		super(message);
	}
	public static void Stop(String value) throws CarStopped {
		if(value=="stop") {
			throw new CarStopped("car stopped exception"); 
		}
		else {
			System.out.println(" Car not stall");
		}
 }
}
	
