package Inters;

public class Bike implements Vehicle {

	@Override
	public void run() {
		System.out.println("bike run");
		
	}

	@Override
	public void horn() {
		System.out.println("bike horn");
		
	}

}
