//package CollectionPackage;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class ConcurrentDemo {
//public static void main(String[] args) throws InterruptedException {
//	ArrayList<String> arl=new ArrayList<String>();
//	arl.add("ram");
//	arl.add("shyam");
//	arl.add("shyam");
//	
//	Concurrent c=new Concurrent(arl);
//	c.start();
//	Iterator<String> it=arl.iterator();
//	while(it.hasNext()) {
//		System.out.println(it.next());
//	}
//	Thread.sleep(1000);
//}
//}
