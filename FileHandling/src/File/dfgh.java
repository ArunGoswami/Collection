package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileAlreadyExistsException;

public class dfgh {
	public static void main(String[] args) throws Exception {
		String str = "Welcome to NareshIT";
		FileOutputStream file = new FileOutputStream("/google.txt");
		byte[] by = str.getBytes();
		file.write(by);
		file.close();
		System.out.println("Completed");
	}
}
