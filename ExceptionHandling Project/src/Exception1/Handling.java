package Exception1;

public class Handling {
public static void nit(int value) {
	try {
		System.out.println("Naresh");
		nit1(value);
		System.out.println("I");
	}
	catch(Exception e) {
		System.out.println("Exception occured");
	}
}
public static void nit1(int uservalue) {
	try {
	System.out.println(10/uservalue);
}
	catch(ArithmeticException e) {
		System.out.println("Arithmetic exception occured");
	}
	finally {
		System.out.println("finally block");
	}
}
}
