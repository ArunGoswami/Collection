package Exception1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StoreCustomerObject {
public static void main(String[] args) throws Exception {
	FileOutputStream fout=new FileOutputStream("C:\\Batch27\\Cus.txt");
	ObjectOutputStream br=new ObjectOutputStream(fout);
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number of object");
	
	try(fout;  br) {
		int n=scan.nextInt();
	for(int i=1; i<n; i++) {
		Customer c=Customer.getCustomerObject();
		br.writeObject(c);
	}
}
	catch(Exception e) {
		System.err.println("exception occured");
	}
	System.out.println("Successfull file created");
}

}
