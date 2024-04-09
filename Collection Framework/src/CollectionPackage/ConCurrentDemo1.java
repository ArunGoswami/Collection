package CollectionPackage;


import java.util.ArrayList;
import java.util.Iterator;

class Concurrent extends Thread
{
	ArrayList<String> al = null;
	
	public Concurrent(ArrayList<String> al)  //al = arl
	{
		this.al = al;
	}
	
	@Override
	public void run()
	{
	  try 
	  {
		Thread.sleep(1000);
	   } 
	  catch (InterruptedException e) 
	  {		
		e.printStackTrace();
	   }
	  al.add("Kiwi");
	}
	
	
}


public class ConCurrentDemo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ArrayList<String> arl = new ArrayList<>();
		arl.add("Apple");
		arl.add("Mango");
		arl.add("Grapes");
		arl.add("Guava");
		
		Concurrent con = new Concurrent(arl);
		con.start();
		
		Iterator<String> itr = arl.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			Thread.sleep(1500);
		}
	}

}
