package Inter;

interface Moveable 
{
   int SPEED = 90;  //public + static + final
   void move();     //public + abstract
   
  
}




 class Car implements Moveable 
{
	@Override
	public void move() 
	{
		//SPEED = 120; Invalid
		System.out.println("Moving with "+SPEED+" Speed");		
	}
}
public class Main 
{
	public static void main(String[] args) 
	{
		Moveable m = new Car();
		m.move();
		System.out.println("Car Speed is :"+Moveable.SPEED);
	}

}


