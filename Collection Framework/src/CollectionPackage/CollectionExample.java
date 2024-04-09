package CollectionPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//public class ArrayListMcq {
//	1.What is the output of the following code
//	public class CollectionExample {
//		public static void main(String[] args) {
//			List<String> list = Arrays.asList("goolge", "nareshIT","NareshIT","progress");
//			Collections.reverse(list);
//			for(String str: list)
//				System.out.print(str+" ");
//		}
//	}
//	A.	progress NareshIT goolge nareshIT
//	B.	goolge progress NareshIT nareshIT 
//	C.	progress NareshIT nareshIT goolge
//	D.	progress goolge NareshIT nareshIT 
//	Answer: C
//
//	2.What is the output of the following code
//	public class CollectionExample {
//		public static void main(String[] args) {
//			ArrayList<String> al = new ArrayList<>();
//			al.add("25");
//			al.add("Naresh");
//			al.add("A");
//			al.add("37");
//			Iterator<String> it = al.iterator();
//			while(it.hasNext())
//				System.out.print(it.next()+" ");
//		}
//	}
//	A.	25 Naresh A 37
//	B.	A 25 Naresh 37
//	C.	25 A Naresh 37
//	D.	37 Naresh A 25
//	Answer: A
//
//
//	3.What is the output of the following Snippet
	public class CollectionExample {
		public static void main(String[] args) {
			ArrayList<String> al = new ArrayList<>();
			al.add("25");
			al.add("Naresh");
			al.add("A");
			al.add("37");
			Iterator<String> it = al.iterator();
			while(it.hasNext())
				System.out.print(it+" ");
		}
	}
//	A.	25 Naresh A 37
//	B.	A 25 Naresh 37
//	C.	25 A Naresh 37
//	D.	Run time error
//	E.	37 Naresh A 25
//	Answer : D
//
//	4.What is the output of the following code
//	public class CollectionExample {
//		public static void main(String[] args) {
//			ArrayList<String> al = new ArrayList<>();
//			al.add("25");
//			al.add("Naresh");
//			al.add("A");
//			al.add("37");
//			al.remove(4);
//			for(String str: al)
//				System.out.print(str+" ");
//		}
//	}
//	A.	ArrayIndexOutofBoundException
//	B.	IndexOutOfBoundsException
//	C.	25 Naresh A
//	D.	NullPointerException
//	Answer: B
//
//
//	5. What is the output of the following code
//	public class CollectionExample {
//		public static void main(String[] args) {
//			ArrayList<Integer> al = new ArrayList();
//			for(int i=0;i<10;i++) 
//			{
//				al.add(i);
//			}
//			for(int str: al)
//				System.out.print(str+" ");
//		}
//	}
//	A.	0 1 2 3 4 5 6 7 8 9
//	B.	1 2 3 4 5 6 7 8 9
//	C.	1 2 3 4 5 6 7 8 10
//	D.	1 2 3 4 5 6 7 8
//	Answer: A
//
//	6. Choose the correct output of the following code
//	public class CollectionExample {
//		public static void main(String[] args) {
//			ArrayList<Integer> al = new ArrayList();
//			for(int i=5;i<10;i++) 
//			{
//				al.add(i);
//			}
//			al.remove(4);
//			for(int str: al)
//				System.out.print(str+" ");
//		}
//	}
//	A.	4 5 6 7 8
//	B.	5 6 7 8
//	C.	4 5 6 7 8 9
//	D.	5 6 7 8 9
//	Answer: B
//
//	7. Choose the correct output of the following code
//	public class CollectionExample {
//		public static void main(String[] args) {
//			ArrayList<String> al = new ArrayList<>();
//			al.add("google");
//			al.add("Naresh");
//			al.add("Information");
//			al.add("Technology");
//			for(int i=0;i<al.size();i++) 
//			{
//				System.out.print(al.get(i).substring(0,6));
//			}
//		}
//	}
//	A.	google Inform Techno Naresh
//	B.	Techno  google Naresh Inform 
//	C.	google Naresh Techno Inform 
//	D.	google Naresh Inform Techno
//	Answer : D
//
//	8.Choose the correct output for the following code
//	public class CollectionExample {
//		public static void main(String[] args) {
//			ArrayList<String> al = new ArrayList<>();
//			System.out.println(al);
//		}
//	}
//	A.	null
//	B.	no output
//	C.	[]
//	D.	Run time error
//	Answer: C
//
//	9.What is the output of the following code
//	public class CollectionExample {
//		public static void main(String[] args) {
//			ArrayList al = new ArrayList<>();
//			al.add(5);
//			al.add("");
//			al.add(10);
//			System.out.println(al.contains(6));
//			System.out.println(al.contains(10));
//			System.out.println(al.contains(null));
//		}
//	}
//	A.	false true false
//	B.	false false false
//	C.	true true true
//	D.	true false true
//	Answer: A
//
//
//	10. What is the output of the following code
//	public class CollectionExample {
//		public static void main(String[] args) {
//			ArrayList al = new ArrayList<>();
//			al.add(50);
//			al.add(25);
//			ListIterator li = al.listIterator();
//			while(li.hasNext())
//				System.out.println(li.next());
//			li.add(22);
//			System.out.println(li.hasNext());
//		}
//	}
//	A.	50 25 true
//	B.	50 25 false
//	C.	25 50 false
//	D.	25 50 true
//	Answer: B
//
//	11. What is the output of the following code
//	public class Test
//	{
//	     public static void main(String[] argv) 
//	     {
//	           Collection c = new ArrayList();
//	           c.add("1");
//	           c.add("2");
//	           c.add("3");
//	           Collection c1 = new ArrayList();
//	           c1.add("1");
//	           c.retainAll(c1);
//	           System.out.println(c);
//	     }
//	}
//
//	12. What is the output of the following code
//	import java.util.ArrayList;
//	import java.util.List;
//
//	public class Test
//	{
//	      public static void main(String[] argv) 
//	      {
//	            List<String> list = new ArrayList<String>();
//	            list.add("a");
//	            list.add("b");
//	            list.add("c");
//	            System.out.println(list.indexOf("a"));
//	            System.out.println(list.indexOf("c"));
//	            System.out.println(list.indexOf("d"));
//	      }
//	}
//
//	13. What is the output of the following code
//	import java.util.*;
//	public class Test
//	{
//	     public static void main(String[] args)
//	     {
//	           Integer int1 = new Integer(10);
//	           Vector vec1 = new Vector();
//	           LinkedList list = new LinkedList();
//	           vec1.add(int1);
//	           list.add(int1);
//	           if(vec1.equals(list)) 
//	                System.out.println("equal");
//	           else  
//	                System.out.println("not equal");
//	     }
//	}
//
//
//	14. What is the output of the following code
//	import java.util.*;
//
//	public class Test
//	{
//	       public static void main(String[] args) 
//	       {
//	             List<Number> list = new ArrayList<Number>();
//	             System.out.format("%b %b %b %d",
//	                 list.add(7),
//	                 list.add(null),
//	                 list.add(7),
//	                 list.size());
//	       }
//	}
//
//	15. What is the output of the following code
//	import java.util.*;
//
//	public class Test
//	{
//	       public static void main(String[] args) 
//	       {
//	            List<Number> list = new ArrayList<Number>();
//	            list.add(7);
//	            list.add(8);
//	            list.add(7);
//	            Number index = list.get(Integer.valueOf(7));
//	            System.out.println(index);
//	        }
//	}
//
//	16. What is the output of the following code
//	import java.util.*;
//
//	public class Test
//	{
//	       public static void main(String[] args) 
//	       {
//	            LinkedList<String> list = new LinkedList<String>();
//	            list.add("X");
//	            list.add("M");
//	            list.add("L");
//	            System.out.println(list.peek());
//	       }
//	}
//
//	17. What is the output of the following code
//	import java.util.*;
//	public class Test
//	{
//	 public static void main(String argv[])
//		 {
//	    	 
//	    	ArrayList list = new ArrayList(); 
//	    	ArrayList listStr = list; 
//	    	ArrayList listBuf = list; 
//	    	listStr.add(0, "Hello"); 
//	    	StringBuffer buff =listBuf.get(0); 
//	       System.out.println(buff.toString());
//	    }
//
//	}
//
//	18. What is the output of the following code
//	import java.util.LinkedList;
//	import java.util.Queue;
//	public class Test18
//	{
//	public static void main(String... args) 
//	{
//		Queue q = new LinkedList();
//		q.add("newyork");
//		q.add("ca");
//		q.add("texas");
//		show(q);
//		}
//		public static void show(Queue q) 
//		{
//	          q.add(new Integer(11));
//	          while (!q.isEmpty ( ) )
//	          System.out.print(q.poll() + "  ");
//	        }
//	}
//
//	19. What is the output of the following code
//	public class Test6
//	{
//		public static void main(String[] args) 
//		{
//			Moof one = new Moof(8);
//			Moof two = new Moof(8);
//			if(one.equals(two))
//			{
//			System.out.println("Equal ...");
//			}
//			else
//			{
//			System.out.println("Not Equal ...");
//			}
//		}
//	}
//	class Moof
//	{
//		private int moofValue;
//		Moof(int val)
//		{
//			moofValue=val;
//		}
//
//		public int getMoofValue()
//		{
//			return moofValue;
//		}
//		public boolean equals(Object o)
//		{
//			if((o instanceof Moof)&&(((Moof)o).getMoofValue()==this.moofValue))
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//
//		}
//	}
//
//	20. What is the output of the following code
//	class Emp 
//	{
//		private int age ;
//		
//		public Emp( int age )
//		{
//			super();
//			this.age = age;
//		}
//		
//		public int hashCode()
//		{
//			return age;
//		}
//	}
//	public class Test8
//	{
//		public static void main(String[] args) 
//		{
//			Emp emp1 = new Emp(23);
//			System.out.println("emp1.hashCode() is :"+emp1.hashCode());
//
//
//			int originalHashCode = System.identityHashCode(emp1);
//			System.out.println("Original hashCode of Emp is :"+originalHashCode);
//		}
//	}
//}
//}
