package Test;

public class Concurrently {
public static void main(String[] args) {
 Thread t1=	new Thread() {
		public void run() {
		for(int i=1; i<10; i++) {
			System.out.println(i);
//		try {
//			sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		}
		}
	};
Thread t2=	new Thread() {
		public void run() {
		for(int i=11; i<20; i++) {
			System.out.println(i);
		}
		}
	};
	t1.start();
	t2.start();
	
}
}
