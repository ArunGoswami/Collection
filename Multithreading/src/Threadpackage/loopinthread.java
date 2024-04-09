package Threadpackage;

class loop extends Thread{
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=0; i<=10; i++) {
			System.out.println(i+""+name);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println("exception occured");
			}
		}
	}
}




public class loopinthread {
public static void main(String[] args) {
System.out.println("main thread started");
	loop l=new loop();
	l.start();
	l.setName("child");
	String name=Thread.currentThread().getName();
   System.out.println(name);
}
}
