package lab;

public class Myprogram2 {
	public static void divisible(int sec) {
		int hour=sec/3600;
		System.out.println("hour is"+hour);
		int minute=sec%3600/60;
		System.out.println("minute is"+minute);
		int second=sec%3600%60/60;
		System.out.println("sec is"+second);
	}
public static void main(String[] args) {
	System.out.println("Enetr the sec");
	int sec=Integer.parseInt(args[0]);
	divisible(sec);
}
}