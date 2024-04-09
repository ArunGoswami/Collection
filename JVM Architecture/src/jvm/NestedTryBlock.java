package jvm;

public class NestedTryBlock 
{
	public static void main(String[] args) 
	{		
	    try {
	    	String str=null;
	    	//System.out.println(str.length());
	    
	    try {
	    	System.out.println(10/0);
	    }
	    catch(Exception e) {
	    	System.out.println("tyui");
	    }
	    
	    }
	    catch(Exception e) {
	    	System.out.println("tyuighj");
	    }
	}
}
