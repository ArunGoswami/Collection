package getter;

public class Manager {
private int salary;

public Manager(int salary) {
	super();
	this.salary = salary;
}

@Override
public String toString() {
	return "Manager [salary=" + salary + "]";
}


public int getSalary() {
	return salary;
}


public void setSalary(int salary) {
	this.salary = salary;
}
public static void main(String[] args) {
	Manager sonu=new Manager(100000);
	System.out.println(sonu);
	sonu.setSalary(150000);
	System.out.println(sonu);
}
}
