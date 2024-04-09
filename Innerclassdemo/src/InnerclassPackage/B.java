package InnerclassPackage;


public class B implements I1 {
int a;
int b;

	public B(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}

	@Override
	public int m1() {
		// TODO Auto-generated method stub
		return a*b;
	}

}
