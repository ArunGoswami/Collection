package File;

import java.io.FileOutputStream;

public class file2 {
public static void main(String[] args) {
	try {
		FileOutputStream f=new FileOutputStream("C:\\Batch27\\Hyderabad.txt");
		String s="Hyderabad is good";
		byte []b=s.getBytes();
		f.write(b);
		System.out.println("sucees");
	}
	catch(Exception e) {
		System.err.println("excepytion occured");
	}
}
}

