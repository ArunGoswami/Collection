package day17;

//public class A {
//    private int data = 15;
//
//    public A() {
//        B objB = new B(this);
//        objB.display();
//    }
//
//    public void show() {
//        System.out.println("instance variable data in A = " + data);
//    }
//}
class Example {
int x;
int y;

public Example(int x, int y) {
    this.x = x;
    this.y = y;
}

public Example(Example e1) {
	// TODO Auto-generated constructor stub
}

public void Example(Example e) {
    this.x = e.y;
    this.y = e.y;
}
}

public class TestMCQ {
public static void main(String[] args) {
Example e1 = new Example(10, 20);
Example e2 = new Example(e1);
e1.x = 30;e1.y = 30;
System.out.println(e1.x +""+e1.y);
System.out.println(e2.x+" "+e2.y);
}
}
