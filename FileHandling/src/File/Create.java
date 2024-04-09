package File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Create {
public static void main(String[] args) throws IOException {
	File f=new File("c://Batch27//India.txt");
	f.createNewFile();
	FileOutputStream fout=new FileOutputStream("c://Batch27//India.txt");
	String s="Hyderabad is city";
	byte b[]=s.getBytes();
	fout.write(b);
	int n=122;
	fout.write(n);
    	System.out.println("success");
}
}
