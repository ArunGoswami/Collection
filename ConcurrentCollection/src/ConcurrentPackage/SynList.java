package ConcurrentPackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SynList {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("1");
	al.add("2");
	al.add("3");
	al.add("4");
	List<String> l=Collections.synchronizedList(al);
	ArrayList<String> a=new ArrayList<String>();
	Runnable r=()->{
		synchronized (al) {
			l.forEach(str->l.add(al));
		}
	};
	Thread t=new Thread(r);
	
}
}
