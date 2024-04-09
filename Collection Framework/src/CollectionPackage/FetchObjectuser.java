package CollectionPackage;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class FetchObjectuser {
public static void main(String[] args) {
	Vector<String> str=new Vector<>();
	str.add("A");
	str.add("A");
	str.add("A");
	str.add("A");
	str.add("A");
//	Enumeration<String >ele=str.elements();
//	while(ele.hasMoreElements()) {
//			System.out.println(ele.nextElement());
//	}
//	for(String f:str) {
//		System.out.println(str);
//	}
	
//	   System.out.println("DATA FROM ITERATOR INTERFACE");
//	     
//	     Iterator<String> itr = str.iterator();
//	     itr.forEachRemaining(ele-> System.out.println(str));
//}
ListIterator<String> li=str.listIterator();
//while(li.hasNext()) {
//	System.out.println(li.next());
//}

str.forEach(strs->System.out.println(str));
str.forEach(System.out::println);
	
	

	
	
}
