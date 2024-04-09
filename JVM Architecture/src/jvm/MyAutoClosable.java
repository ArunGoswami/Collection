package jvm;

public class MyAutoClosable implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("handle re");
	}
	public void display(String str)
	{
	if (str==null)
	{
	throw new RuntimeException();
	}
	else
	{
	System.out.println("i dont have exception");
	}
	}
	public static void main(String args[])throws Exception
	{
	MyAutoClosable m = new MyAutoClosable();
	try (m)
	{
	m.display(null);
	}
}
}
