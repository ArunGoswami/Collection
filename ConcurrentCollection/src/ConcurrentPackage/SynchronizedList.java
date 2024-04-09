package ConcurrentPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SynchronizedList {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("a");
	al.add("b");
	al.add("c");
	al.add("d");
	Collection<String> syn=Collections.synchronizedCollection(al);
	Runnable listoperation=()->{
		synchronized (syn) {
			syn
		}
	}
}
}
