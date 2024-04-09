package File;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FilecopyProgram {
public static void main(String[] args) throws Exception {
	FileInputStream f=new FileInputStream("C:\\Batch27\\ab.txt");
	FileOutputStream fout1=new FileOutputStream("C:\\Batch27\\ab1.txt");
	FileOutputStream fout2=new FileOutputStream("C:\\Batch27\\ab2.txt");
  
	ByteArrayOutputStream ba=new ByteArrayOutputStream();
	
	try(f;fout1;fout2;ba){
		int i;
		while((i=f.read())!=-1) {
			ba.write((byte)i);
		}
		ba.writeTo(fout1);
		ba.writeTo(fout2);
		
	}
	catch(Exception e) {
		System.out.println("Exception occured");
	}
System.out.println("success");
}
}
