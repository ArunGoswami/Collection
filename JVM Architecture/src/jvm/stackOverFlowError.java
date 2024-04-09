package jvm;

public class stackOverFlowError {
	public void display()
	{
	System.out.println(" I am StackOverFlow");
	display();
	}
	public static void main(String[] args) {
		new stackOverFlowError().display();
	}
}
