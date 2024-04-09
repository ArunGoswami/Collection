package jvm;

public class FileResources implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("File Resources");
		
	}

}
