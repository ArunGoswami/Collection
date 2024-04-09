package card;

public class Employee {
private int employeeId;
private String employeeName;
private double salary;
public Employee(int employeeId, String employeeName,double salary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.salary=salary;
}

public int getEmployeeId() {
	return employeeId;
}
 String getEmployeeName() {
	return employeeName;
}
 public double getEmployeesalary() {
	 return salary;
 }
 public static String getEmployeeData(int salary) {
     if (salary >= 60000) {
         return "developer";
         
     } else if (salary >= 40000) {
        return "designer";
         
     } else {
        return "tester";
 }
    
 }

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
}

}
