package jvm;

public class FinallyBlock 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		
		try
		{
			System.out.println(10/0);
		}
	   catch(Exception e) {
		   System.err.println("general error");
	   }
		finally {
			System.out.println("ghjk");
		}
		System.out.println("Main method ended");
	}

}
