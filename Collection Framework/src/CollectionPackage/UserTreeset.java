package CollectionPackage;

import java.util.ArrayList;
import java.util.Comparator;

record Student22(int id,String name) implements Comparable<Student> {

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
}


public class UserTreeset {
public static void main(String[] args) {
	ArrayList<Student22> a=new ArrayList<Student22>();
	a.add(new Student22(1, "gfhj"));
	a.add(new Student22(3, "gfdj"));
	a.add(new Student22(2, "tyuhj"));
	System.out.println(a);
}
}
