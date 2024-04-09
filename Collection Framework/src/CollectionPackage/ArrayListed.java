package CollectionPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListed {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<>();
	a.add("1");
	a.add("2");
	a.add("3");
	a.add("4");
	System.out.println(a);
	a.remove(0);
	System.out.println(a);
	System.out.println(a.size());
	Collections.sort(a);
	a.forEach((s)->System.out.println(a));
	}
}
