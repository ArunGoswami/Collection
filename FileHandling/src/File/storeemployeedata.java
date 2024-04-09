package File;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class storeemployeedata {
public static void main(String[] args) throws Exception {
	FileOutputStream fout=new FileOutputStream("c://Batch27//india.txt");
	ObjectOutputStream br=new ObjectOutputStream(fout);
	Scanner scan=new Scanner(System.in);
	try(fout; br; scan){
		int numberOfObj = scan.nextInt();
		
		for(int i=1; i<=numberOfObj; i++)
		{
			Employee obj =Employee.getEmployeeObject();	
			br.writeObject(obj);
		}
	}
	catch(Exception e)
	 {
		 e.printStackTrace();
	 }
     System.out.println("Employee data stored successfully");
	}

}
