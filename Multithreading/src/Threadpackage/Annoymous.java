package Threadpackage;

public class Annoymous {
public static void main(String[] args) {
	Thread t=new Thread(){
		@Override
		public void run() {
			System.out.println("current thread is running");
		}
	};
	t.start();
}
}
