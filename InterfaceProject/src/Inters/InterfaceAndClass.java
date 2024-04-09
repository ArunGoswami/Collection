package Inters;

interface c
{
  default void m1() {
	  System.out.println("m1i");
  }
}
class d
{
	public void m1() {
		  System.out.println("m1c");
	  } 
}
class e extends d implements c
{
	
}

public class InterfaceAndClass {

	public static void main(String[] args) 
	{
		e ee=new e();
		ee.m1();
	}

}