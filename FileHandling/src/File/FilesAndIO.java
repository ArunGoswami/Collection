package File;

import java.io.File;

public class FilesAndIO {
	public static void main(String[] args) {
		File file = new File("/");
		System.out.println(file.canRead());
		System.out.println(file.canExecute());
	}
}
