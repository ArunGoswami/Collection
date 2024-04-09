package Threadpackage;

public class Runna {
public static void main(String[] args) {
	Runnable r=new Runnable() {

		@Override
		public void run() {
			System.out.println("child thread");
			
		}
		
	};
	Thread t=new Thread(r);
	t.start();
	
	new Thread(()->System.out.println("child thead"),"c").start();
	
}
}
