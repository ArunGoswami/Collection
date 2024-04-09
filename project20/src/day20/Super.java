package day20;
class Superior {
public Superior(){
	super();
	System.out.println("No arguement");
}
public Superior(String str) {
	this();
	System.out.println("parametarized constructor"+str);
}
}
class Sub extends Superior{
	public Sub() {
		super("NIT");
		System.out.println("No arguement");
	}
}
public class Super{
	public static void main(String[] args) {
		Sub s1=new Sub();
	}
}