package CollectionPackage;

import java.util.Collections;
import java.util.Vector;

public class vectorclassmethod {
public static void main(String[] args) {
	Vector<Integer> v=new Vector<Integer>();
	v.add(2);
	v.add(1);
	v.add(3);
	Collections.sort(v);
	System.out.println(Collections.max(v));
	System.out.println(Collections.min(v));
	System.out.println(v);
	v.stream().filter(num -> num%2==0).forEach(System.out::println);}
}
