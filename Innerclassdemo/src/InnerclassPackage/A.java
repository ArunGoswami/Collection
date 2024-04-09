package InnerclassPackage;

public class A implements I1 {
int a;
int b;

	public A(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}

	@Override
	public int m1() {
		// TODO Auto-generated method stub
		return a+b;
	}

}
