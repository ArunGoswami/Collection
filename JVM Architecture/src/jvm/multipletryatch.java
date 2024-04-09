package jvm;

public class multipletryatch {
public static void main(String[] args) {
	
	try {
		System.out.println(10/0);
	}
		catch(ArithmeticException e) {
			System.err.println("divide by zero");
		}
	
try {
	int arr[]= {1,2};
	System.out.println(arr[2]);
}
	catch(ArrayIndexOutOfBoundsException e) {
		System.err.println("Array is out of limit");
	}
}
}

