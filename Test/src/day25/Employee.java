package day25;

public class Employee {
private int employeeId;
private String employeeName;
private int employeeSalary;
public Employee(int employeeId, String employeeName, int employeeSalary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
}
public void designation() {
	if(employeeSalary>50000) {
		System.out.println("Manager");
	}
	else if(employeeSalary>30000 && employeeSalary==5000) {
		System.out.println("developer");
	}
	else if(employeeSalary<30000) {
		System.out.println("Tester");
	}
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
			+ employeeSalary + "]";
}
public static void main(String[] args) {
	Employee sonu=new Employee(123,"sonu",90000);
	System.out.println(sonu);
	sonu.designation();
	
}
}
