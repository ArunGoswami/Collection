package CollectionPackage2;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapTrial {
public static void main(String[] args) throws InterruptedException {
	HashMap<Object,Object> w=new HashMap<>();
	Object t=new Object();
	w.put(t, "Anu");
   t=null;
   System.out.println(w);
   System.gc();
   Thread.sleep(1000);
   System.out.println(w);
}
}
