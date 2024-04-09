package CollectionPackage;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet<Object> h=new HashSet<Object>();
	boolean ba[] = new boolean[5];
	
	ba[0]=h.add(1);
	ba[1]=h.add(2);
	ba[2]=h.add(3);
	ba[3]=h.add(4);
	System.out.println(h);
	h.forEach(s->System.out.println(s));
	System.out.println(ba);
	System.out.println(Arrays.toString(ba));
}
}
