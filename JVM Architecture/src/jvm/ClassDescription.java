package jvm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.DateFormat.Field;

public class ClassDescription 
{
	public static void main(String[] args) throws Exception
	{
	  Class cls = Class.forName(args[0]);
	  
	  System.out.println("Class Name is :"+cls.getName());
	  System.out.println("Package Name is :"+cls.getPackageName());
	  
	  System.out.println("Methods available in the class :");
	                   
	  Method[] methods = cls.getDeclaredMethods();
	  int count = 0;
	  for(Method method : methods)
	  {
		  System.out.println(method.getName());
		  count++;
	  }
	  System.out.println("Total Methods are :"+count);
	  
	  System.out.println("Constructor Information");
	 Constructor[] constructors = cls.getDeclaredConstructors();
	 for(Constructor constructor : constructors)
	 {
		 
		 System.out.println(constructor.getName());
	 }
	  
	 System.out.println("Field Information :");
	 
	 java.lang.reflect.Field[] fields = cls.getDeclaredFields();
	 for(java.lang.reflect.Field field : fields)
	 {
		 System.out.println(field.getName());
	 }
	  
	  
	}

}
