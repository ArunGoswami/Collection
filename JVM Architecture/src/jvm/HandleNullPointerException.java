package jvm;

public class HandleNullPointerException {
public void display(String str) {

	System.out.println(str.length());
}
public static void main(String[] args) {
	HandleNullPointerException h=null;
	h.display(null);
//	if (h==null)
//	{
//	h= new HandleNullPointerException();
//	h.display("ghj");
//	}
//	else
//	{
//	h.display(null);
//	}
}
}
