package Threadpackage;

class started extends Thread {
@Override
public void run()  {
	System.out.println("child thread is running");
}
}
public class start{
public static void main(String[] args) {
	System.out.println("main thred started");
	started s=new started();
	s.start();
	
	started s1=new started();
	s1.start();
	
	System.out.println(10/0);
	System.out.println("main thread ended");
}
}