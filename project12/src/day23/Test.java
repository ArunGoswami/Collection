package day23;

public class Test {
public static void main(String[] args) {
	College holy=new College("holy","hyd");
	System.out.println(holy);
	Student sonu=new Student("Sonu",123,15000,holy);
	System.out.println(sonu);
	Student monu=new Student("monu",1234,15000,holy);
	System.out.println(monu);
}
}
