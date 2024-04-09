package interface2;

interface A{
	default void m1() {
		System.out.println("m1");
	}
}
interface B{
	default void m2() {
		System.out.println("m2");
	}
}
class c implements A,B{
	void m3() {
		System.out.println("m3");
		A.super.m1();
		B.super.m2();
	}
}
public class multiple {
public static void main(String[] args) {
	c C=new c();
	C.m3();
	C.m1();
	C.m2();
}
}
