package Exception1;

public class CarTest extends Exception{
public static void main(String[] args) {
	try {
	CarStopped.Stop("stop");
}
	catch(CarStopped e) {
		System.out.println("car stop");
	}
	
}

		
	}

