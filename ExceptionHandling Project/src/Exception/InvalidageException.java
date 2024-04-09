package Exception;

import java.util.Scanner;

public class InvalidageException extends Exception {
	 
	InvalidageException (){
		 
	 }
 InvalidageException (String str){
		 super(str);
	 }
  
 public static void main(String[] args) throws InvalidageException {
	 InvalidageException e=new InvalidageException();
	 Scanner scan=new Scanner(System.in);
	 int age=scan.nextInt();
	try {
         if(age<18) {
        	 throw new InvalidageException("age is invalid"); 
         }
         else {
        	 System.out.println("age is valid");
         }
	}
	catch(InvalidageException f) {
		System.out.println("age is not valid");
	}
}

}
