package Inter;

public abstract class Employee {
	 String name;
	 int employeeId ;
	public Employee(String name, int employeeId) {
		super();
		this.name = name;
		this.employeeId = employeeId;
	} 
	 public abstract int calculateSalary();
	 public abstract int generatePayStub();
	 public String  displayEmployeeInfo() {
		 return null;
	 }
}
