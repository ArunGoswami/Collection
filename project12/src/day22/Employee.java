package day22;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private int salary;
	private int pos;

	public Employee(int employeeId, String employeeName, int salary, int pos) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.pos = pos;
	}

	@Override
	public String toString() {
		return "EmployeeId: " + employeeId + ", EmployeeName: " + employeeName +
			   ", EmployeeSalary: " + salary + ", EmployeePos: " + pos;
	}

	public static void main(String[] args) {
		Employee E1 = new Employee(123, "anu", 25000, 4);
		System.out.println(E1);
		Employee E2 = new Employee(1234, "anu", 25000, 4);
		System.out.println(E2);
	}
}
