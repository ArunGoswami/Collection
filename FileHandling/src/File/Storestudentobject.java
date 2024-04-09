package File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Storestudentobject {
public static void main(String[] args) throws Exception {
	FileOutputStream fout=new FileOutputStream("C://Batch27//ab.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fout);
	Scanner scan =new Scanner(System.in);
	try(fout; oos; scan){
		int n=scan.nextInt();
		for(int i=0; i<n; i++){
			Student stud=Student.getStudentObject();
			oos.writeObject(stud);
		}
		
	}
	catch(Exception e) {
		System.out.println("Exception occured");
	}
	System.out.println("successfull");
}
}
