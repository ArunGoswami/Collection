package CollectionPackage;

import java.util.Stack;

public class Stackdemo {
public static void main(String[] args) {
	Stack<Object> s=new Stack<Object>();
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	System.out.println(s.peek());
	System.out.println(s.pop());
	System.out.println(s);
	System.out.println(s.search(1));
}
}
