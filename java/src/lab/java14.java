package lab;

public class java14 {
public static void main(String[]args) {
		 int a=Integer.parseInt(args[0]);
		 int r=a%10;
		 a/=10;
		 int s=a+r;
		 System.out.println(s);
}
}
