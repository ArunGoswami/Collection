package File;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArray {
public static void main(String[] args) throws Exception {
	
	var fin = new FileInputStream("C:\\Batch27\\Cus.txt");
	
	 var f1= new FileOutputStream("C:\\Batch27\\f1.txt");
	 var f2= new FileOutputStream("C:\\Batch27\\f2.txt");
	 var f3= new FileOutputStream("C:\\Batch27\\f3.txt");
	 
	 ByteArrayOutputStream bao=new ByteArrayOutputStream();
	 try(fin; f1; f2; f3; bao){
	
		int i;
		while((i=fin.read())!=-1) {
		bao.write((byte)i);
		 }
		bao.writeTo(f1);
		bao.writeTo(f2);
		bao.writeTo(f3);
		bao.flush();
		System.out.println("success");
	 }
	 catch(IOException e) {
		 System.err.println("file cannot be stored in bytearrayS");
	 }
}
}
