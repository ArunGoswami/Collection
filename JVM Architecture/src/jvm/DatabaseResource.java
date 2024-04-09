package jvm;

public class DatabaseResource implements AutoCloseable{
public  void close() throws Exception{
	System.out.println("Database close method invoked");
}
}
