package EnumPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

record person(int id,String name) implements Comparable<person> {

	@Override
	public int compareTo(person o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
}
public class PersonTest {
public static void main(String[] args) {
	List<person> l=new ArrayList<person>();
	l.add(new person(1, "A"));
	l.add(new person(3, "B"));
	l.add(new person(6, "C"));
	l.add(new person(2, "D"));
	l.add(new person(4, "E"));
	Collections.sort(l);
	System.out.println(l);
}
}
