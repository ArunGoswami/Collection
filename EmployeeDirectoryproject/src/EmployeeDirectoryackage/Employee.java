package EmployeeDirectoryackage;

public class Employee {
	String name;
	int position; 
	int salary;
	public Employee(String name, int position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
		public void setName(String name) {
		this.name = name;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}
	
}
