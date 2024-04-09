package CollectionPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

record Student2(int id,String name) {

	

	
	
}
public class Student1 {
public static void main(String[] args) {
	ArrayList<Student2> s=new ArrayList<Student2>();
	s.add(new Student2(1, "anu"));
	s.add(new Student2(4, "sonu"));
	s.add(new Student2(3, "monu"));
	s.add(new Student2(2, "jubetr"));
	Comparator<Student2> ss=new Comparator<Student2>() {
		
		@Override
		public int compare(Student2 o1, Student2 o2) {
			
			return o1.id()-o2.id();
		}
	};
	Collections.sort(s,ss);
	System.out.println(s);
}
}
