package day20;

class B {
B(){
	super();
System.out.println("B");	
}
B(int x){
	this();
	
}
}
class C extends B{
	public C(int x){
		super(x);
		System.out.println("number"+x);
			
		
	}

	
}
public class A{
	public static void main(String[] args) {
		C c1=new C(1);
	}
}
