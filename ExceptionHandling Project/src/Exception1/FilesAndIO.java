package Exception1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesAndIO {
	public static void nit() throws IOException {
		String str = "NareshIT";
		FileOutputStream fout = new FileOutputStream("C:\\Batch27\\hai.txt");
		byte b[] = str.getBytes();
		fout.write(b,0,6);
		fout.flush();		
		fout.close();
	}
	
	public static void nit1() throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Batch27\\hai.txt");
		int count = fin.available();
		System.out.println(count);
		byte b[] = new byte[count];
		
		DataInputStream din = new DataInputStream(fin);
		din.read(b); 
		for(byte bite : b) 
		{
			System.out.print((char)bite);
		}
	}
	public static void main(String[] args) throws IOException {
		nit();
		nit1();
	}
}
