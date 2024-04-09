package jvm;

class B {
	static {
		int a = 10;
		a = B.a;
		new B(a);
	}
	static int a = 40;
	{
		int a = 20;
		b = a;
		B.a = a;
		System.out.println(B.a);
	}
	int b = 10;

	B(int a) {
		System.out.println(this.a + a);
		this.b = B.a;
		A();
	}

	void A() {
		System.out.println(b);
	}

}

public class TestMcq {
	public static void main(String[] args) {
         System.out.println(B.a);
	}
}
