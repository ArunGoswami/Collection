package jvm;

public class NetworkResource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Network resourse");
		
	}

}
