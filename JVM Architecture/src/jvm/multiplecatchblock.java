package jvm;

public class multiplecatchblock {
public static void main(String[] args) {
	try {
		int c = 10/2;			
		System.out.println("c value is :"+c);	
		
		int []x = {12,78,56};
		System.out.println(x[5]);
	}
	catch(ArrayIndexOutOfBoundsException e1)
	{
		System.err.println("Array is out of limit...");
	}
	catch(ArithmeticException e1)
	{
		System.err.println("Divide By zero problem...");
	}
	catch(Exception E) {
		System.err.println("genaeral ");
	}
}
}
