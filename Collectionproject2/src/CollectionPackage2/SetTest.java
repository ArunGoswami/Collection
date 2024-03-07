package CollectionPackage2;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
public static void main(String[] args) {
	Set<Integer> s=new HashSet<>();
	s.add(1);
	s.add(2);
	s.add(3);
	System.out.println(s);
	Set<Integer> s1=new HashSet<>();
	s1.add(1);
	s1.add(5);
	s1.add(3);
	System.out.println(s1);
//	for(int i=0; i<s1.size(); i++) {
//		s1=s;
//	}
	System.out.println(s.addAll(s1));
	System.out.println(s);
	
	System.out.println(s.retainAll(s1));
}
}
