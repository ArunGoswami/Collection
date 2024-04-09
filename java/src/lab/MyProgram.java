package lab;

public class MyProgram {
	public static void divisible(int n) {
		if(n%3==0 && n%5==0) {
			System.out.println("divisible");
		}
		else {
			System.out.println("not divisible");
		}
	}
public static void main(String[] args) {
	System.out.println("Enetr the number");
	int n=Integer.parseInt(args[0]);
	divisible(n);
}
}
