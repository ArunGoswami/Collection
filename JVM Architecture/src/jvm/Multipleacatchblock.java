package jvm;

public class  Multipleacatchblock {
	public void multiple() {
	int a[]=new int[2];
	try
	{
	a [4]=10/0;
	}
	catch(ArrayIndexOutOfBoundsException e){
	e.printStackTrace();
	}
	catch (ArithmeticException e) {
	e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		Multipleacatchblock m=new Multipleacatchblock();
		m.multiple();
	}
}
