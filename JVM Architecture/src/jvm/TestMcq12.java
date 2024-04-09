package jvm;

class Foo {
	static int x = 10;
	static Foo f;
	int y = m1();
	static {
		System.out.println("1");
		f = new Foo();
	}
	{
		System.out.println(y);
	}

	int m1() {
		System.out.println("m1");
		return 20;
	}

}

public class TestMcq12 {
	public static void main(String[] args) {
		System.out.println("Main start");
          Foo f=new Foo();  
	}
}
