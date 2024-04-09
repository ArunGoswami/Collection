package GenericPackage;

import java.util.*;
public class WeakHashMapclass
{
	public static void main(String args[]) throws Exception
	{
	    WeakHashMap<Test,String>map=new WeakHashMap<>();

		Test  t  = new Test();
		map.put(t," Arun "); 

		System.out.println(map); 
		
		
		
		t = null;
		
		System.gc();			
		Thread.sleep(3000); 
		
		System.out.println(map); 
	}
}

class Test
{
	
	@Override
	public void finalize() 
	{
		System.out.println("finalize method is called");
	}
}

