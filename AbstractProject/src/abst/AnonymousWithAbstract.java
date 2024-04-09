package abst;

abstract class Animal
{
	public abstract void sleep();
}

public class AnonymousWithAbstract 
{
	public static void main(String[] args) 
	{
		//Anonymous inner class
		Animal lion = new Animal()
		{
			@Override
			public void sleep()
			{
				System.out.println("Lion is sleeping");				
			}			
		};
		
		        //Anonymous inner class
				Animal dog = new Animal()
				{
					@Override
					public void sleep()
					{
						System.out.println("Dog is sleeping");				
					}			
				};
		lion.sleep();  dog.sleep();
	}

}
