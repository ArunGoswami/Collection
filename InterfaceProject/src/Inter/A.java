package Inter;

interface A{
	void sum();
}
interface B extends A{
	void sum1();
}
interface C extends A,B{
	void sum2();
}



