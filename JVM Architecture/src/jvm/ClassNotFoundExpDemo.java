package jvm;

public class ClassNotFoundExpDemo  {
	 Class c;
	ClassNotFoundExpDemo (){
		try {
			 c = Class.forName("jvm.ClassNotFoundExpDemo");
		}
		catch (ClassNotFoundException e)
		{ 
			e.printStackTrace(); 
		}
	}
	public static void main(String[] args) {
		
		new ClassNotFoundExpDemo();
	}
}
