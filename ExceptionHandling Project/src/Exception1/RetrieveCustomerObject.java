package Exception1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class RetrieveCustomerObject {
public static void main(String[] args) throws Exception {
	FileInputStream fin=new FileInputStream("C:\\Batch27\\Cus.txt");
	ObjectInputStream br=new ObjectInputStream(fin);
	try(fin; br) {
		Customer c=null;
		while((c = (Customer)br.readObject())!=null) {
			System.out.println(c);
		}
	}
	catch(EOFException e) {
		
		System.err.println("end of file");
	}
}
}
