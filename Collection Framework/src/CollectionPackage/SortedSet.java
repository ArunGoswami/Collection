package CollectionPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

record Employee(int id,String ename) implements Comparable<Employee> {

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
}
	
	
}
public class SortedSet {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(1, "anu"));
		al.add(new Employee(2, "sandeep"));
		al.add(new Employee(4, "ravi"));
		al.add(new Employee(3, "juber"));
		Collections.sort(al);
		System.out.println(al);
	}
}
