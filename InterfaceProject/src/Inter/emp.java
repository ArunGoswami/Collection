package Inter;

public class emp {
public static void main(String[] args) {
	Supervisor s=new Supervisor("super", 1, 2100);
	System.out.println(s);
	System.out.println(s.calculateSalary());
	System.out.println(s.generatePayStub());
	
	Manager m=new Manager("sonu", 2, 100000);
	System.out.println(m);
	System.out.println(m.calculateSalary());
	System.out.println(m.displayEmployeeInfo());
	
}
}
