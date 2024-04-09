package Threadpackage;

class UserThreads extends Thread {
@Override
public void run() {
	System.out.println("child thread is running");
}
}
public class Test{
	public static void main(String[] args) {
		System.out.println("main method started");
		UserThreads us=new UserThreads();
		us.start();
		System.out.println(us.isAlive());
		System.out.println("main method ended");
	}
}
