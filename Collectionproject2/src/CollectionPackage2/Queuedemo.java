package CollectionPackage2;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queuedemo {
public static void main(String[] args) {
	PriorityQueue<Object> q=new PriorityQueue<Object>();
	q.add(1);
	q.add(2);
	q.add(3);
	System.out.println(q);
	System.out.println(q.peek());
	System.out.println(q.poll());
	System.out.println(q);
}
}
