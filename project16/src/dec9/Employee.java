package dec9;
import java.util.Scanner;
public class Employee {
private int employeeId;
private String employeeName;
private int  employeeSalary;
public Employee(int employeeId, String employeeName, int employeeSalary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
}
public static Employee getEmployeeobject() {
	Scanner scan=new Scanner(System.in);
	System.out.println("Eneter employeeId");
	int Id=scan.nextInt();
	System.out.println("Eneter employeeName");
    String Name=scan.next();
    scan.next();
    System.out.println("Eneter employeesalary");
    int salary=scan.nextInt();
    
    return new Employee(Id,Name,salary);
}

@Override
public String toString() {
	return "Empoyee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary=" + employeeSalary
			+ "]";
}

}
