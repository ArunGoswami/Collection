package CollectionPackage2;

import java.util.*;
public class WeakHashMapDemo
{
	public static void main(String args[]) throws Exception
	{
	    WeakHashMap<Test,String> map = new WeakHashMap<>();

		Test  t  = new Test();
		map.put(t," Rahul "); 

		System.out.println(map); //{Test Nit = Rahul}
		
		t = null;
		
		System.gc();	//Explicitly calling garbage collector 
		
		Thread.sleep(3000); 
		
		System.out.println(map); //{}
	}
}

class Test
{
	@Override
	public String toString()
	{
		return "Test Nit";
	}
	
	@Override
	public void finalize() //called automaticaly if an object is eligible 4 GC
	{
		System.out.println("finalize method is called");
	}
}
