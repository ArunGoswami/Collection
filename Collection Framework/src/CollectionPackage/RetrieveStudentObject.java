package CollectionPackage;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class RetrieveStudentObject  {
public static void main(String[] args) throws Exception {
FileInputStream fis=new FileInputStream("c://Batch27//student.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
try(fis; ois){
	Student stud=null;
	while((stud =(Student)ois.readObject())!=null) {
		System.out.println(stud);
	}
	catch(EOFException e)
	{
		System.err.println("End of file reached!!!");
		
	}
}
}
}
}