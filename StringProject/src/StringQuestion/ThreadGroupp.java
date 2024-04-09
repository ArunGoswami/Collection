package StringQuestion;

public class ThreadGroupp implements Runnable
{

	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
	}
	
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("First-Group..");
		
		Thread t = new Thread(tg,new ThreadGroupp(),"first-thread");
		Thread t2 = new Thread(tg,new ThreadGroupp(),"second-thread");
		t.start();
		t2.start();

	}
}
