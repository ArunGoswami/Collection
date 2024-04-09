package jvm;

public class ExceptionDem0a{
	

public void checkException()
{

	 try
	 {
	String str = null;
	System.out.println(str.length());
	char c=str.charAt(0);
		}
	 catch(NullPointerException e)
	 {
	 System.out.println("Null Pointer Exception");
	 }
	}

 

public static void main(String[] args) {
	ExceptionDem0a a=	new ExceptionDem0a();
	a.checkException();
}
}