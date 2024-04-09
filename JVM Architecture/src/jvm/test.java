package jvm;

public class test {
public static void main(String[] args) throws Exception {
	try(DatabaseResource d=new DatabaseResource(); FileResources f=new FileResources()){
		System.out.println(10/0);
	}
	catch(ArithmeticException e)
	{
		System.err.println("Divide by zero prob..");
	}
}
}
