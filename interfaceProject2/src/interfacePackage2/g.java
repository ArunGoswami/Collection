package interfacePackage2;

interface f {
static void m1() {
	System.out.println("mmmm");
}
}
class g implements f{
	public static void main(String[] args) {
		f.m1();
		m1();
		g.m1();
		g G=new g();
		g.m1();
	}
}