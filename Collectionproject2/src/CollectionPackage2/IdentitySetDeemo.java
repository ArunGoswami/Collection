package CollectionPackage2;

import java.util.IdentityHashMap;

public class IdentitySetDeemo {
public static void main(String[] args) {
	IdentityHashMap<String, String> t=new IdentityHashMap<String, String>();
	t.put("a", "A");
	t.put(new String("a"), "A");
	System.out.println(t);
}
}
