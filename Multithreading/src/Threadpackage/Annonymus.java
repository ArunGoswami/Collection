package Threadpackage;

class Demo implements Runnable{

	@Override
	public void run() {
		System.out.println("child thread");
		
	}
	
}
public class Annonymus {
public static void main(String[] args) {
	Demo d=new Demo();
	Thread t=new Thread(d);
	t.start();
	d.run();
}
}
