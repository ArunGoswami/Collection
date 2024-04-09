package day18;

class A{
	
	int y;
	A(int x,int y){
		super();
		System.out.println("A");
	}
}
	class B extends A{
	B(int x){
		super(x, x);
		System.out.println("B");
	}
	}

public class Test{
	public static void main(String[] args) {
		B b=new B(1);
		System.out.println(b);
	}
	
}
