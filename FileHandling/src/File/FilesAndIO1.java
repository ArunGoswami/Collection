package File;

import java.io.File;
import java.io.IOException;

public class FilesAndIO1 {
	public static void main(String[] args)throws IOException  
	{
		File file = new File("hai.txt");
		boolean result = file.createNewFile();
		System.out.println(result);
	}
}