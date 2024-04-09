package m;

public class test {
public static void main(String[] args) {
	Employee emp=new Employee(1,"sonu");
	System.out.println(emp);
	Manager m1=new Manager(emp);
	System.out.println(m1);
}
}
