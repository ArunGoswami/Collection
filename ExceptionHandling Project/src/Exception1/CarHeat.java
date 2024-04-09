package Exception1;

public class CarHeat  extends Exception {
	CarHeat(){
		
	}
	CarHeat(String message){
		super(message);
	}
	public static void Stop(int value) {
		if(value>=50) {
			System.out.println();
		}
		else {
			System.out.println(" Car not stall");
		}
}
