package day17;

public class Edata {
	public static void main(String[] args) {
	Employee emp=new Employee("anu",20,5000,"A");
	System.out.println(emp);
	
	Employee emp2=new Employee(emp);
	System.out.println(emp2);
	
	System.out.println(emp2.raiseSalary(10));
}
}
