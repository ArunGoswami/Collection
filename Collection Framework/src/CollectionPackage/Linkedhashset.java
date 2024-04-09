package CollectionPackage;

import java.util.LinkedHashSet;

public class Linkedhashset {
public static void main(String[] args) {
	LinkedHashSet<Object> t=new LinkedHashSet<Object>();
	t.add(1);
	t.add(2);
	t.add("fghj");
	t.add(4);
	System.out.println(t);
	LinkedHashSet<Object> t1=new LinkedHashSet<Object>();
	t1.add(1);
	t1.add(2);
	t1.add("fghj");
	t1.add(4);
	System.out.println(t);
	System.out.println(t.contains(1));
}
}
