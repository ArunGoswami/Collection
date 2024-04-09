package abs;


abstract class Car
{
	protected int speed = 100;
	
	public Car()
	{
		System.out.println("Car class Constructor");
	}
	
	public void getCarDetails()
	{
		System.out.println("My car has 4 wheels");
	}
		
	public abstract void run();
	
}

class Honda extends Car
{
	
	@Override
	public void run() 
	{
		System.out.println("Honda Car is running");		
	}	
}

public class InterviewQuestion 
{
	public static void main(String[] args) 
	{
       Car c1 = new Honda();
       System.out.println("Speed is :"+c1.speed);
       c1.getCarDetails();
       c1.run();

	}

}
