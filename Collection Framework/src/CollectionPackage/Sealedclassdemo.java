package CollectionPackage;

sealed class First permits Second
{
	public void m1()
	{
		System.out.println("Sealed-class Method()");
	}
}

non-sealed class Second extends First
{
	@Override
	public void m1()
	{
		System.out.println("non-Sealed-class Method()");
	}
}

public class Sealedclassdemo 
{
	public static void main(String[] args) {
		First f = new Second();
		f.m1();
	}
}
