package CollectionPackage2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap<Object, Object> h=new HashMap();
	h.put(1, "df");
	h.put(2, "ghj");
	h.put(3, "ert");
	h.put(4, "cvb");
	h.put(5, "jkl");
	System.out.println(h);
	System.out.println(h.containsKey(2));
	System.out.println(h.containsValue("df"));
	for(Map.Entry m : h.entrySet())
	 {  
		 System.out.println(m.getKey()+" : "+m.getValue());  
	} 
	for(Map.Entry m:h.entrySet()) {
		System.out.println(m.getKey()+""+m.getValue());
	}
	h.forEach((k,v)->System.out.println(k+""+v));
}
}
