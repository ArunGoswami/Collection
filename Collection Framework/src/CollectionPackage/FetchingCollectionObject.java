package CollectionPackage;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class FetchingCollectionObject {

	public static void main(String[] args) 
	{
		Vector<String> fruits = new Vector<>();
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Guava");
		fruits.add("Grapes");

		System.out.println("FETCHING THE DATA FROM ENUMERATION");
		
	     Enumeration<String> ele = fruits.elements();
		
	     while(ele.hasMoreElements())
	     {
	    	 System.out.println(ele.nextElement());
	     }
		
	     System.out.println("DATA FROM ORDINARY FOR LOOP");
	     
	     for(int i=0; i<fruits.size();i++)
	     {
	    	 System.out.println(fruits.get(i));
	     }
		
	     System.out.println("DATA FROM FOR EACH LOOP");
	     
	     for(String fruit : fruits)
	     {
	    	 System.out.println(fruit);
	     }
		
	     System.out.println("DATA FROM ITERATOR INTERFACE");
	     
	     Iterator<String> itr = fruits.iterator();
	     itr.forEachRemaining(fruit-> System.out.println(fruit));
	     
	     /*while(itr.hasNext())
	     {
	    	 System.out.println(itr.next());
	     }*/
	     
	     System.out.println("DATA FROM LISTITERATOR INTERFACE");
	     
	    ListIterator<String> lst = fruits.listIterator();
	    
	    System.out.println("IN FORWARD DIRECTION");
	    
	    while(lst.hasNext())
	    {
	    	System.out.println(lst.next());
	    }
	    
       System.out.println("IN BACKWARD DIRECTION");
	    
	    while(lst.hasPrevious())
	    {
	    	System.out.println(lst.previous());
	    }
	    
	    System.out.println("FETCHING BY USING FOR EACH METHOD");
	fruits.forEach(fruit-> System.out.println(fruit.toUpperCase()));
	    
	    System.out.println("BY USING METHOD REFERENCE");
	    fruits.forEach(System.out::println);
	}

}

