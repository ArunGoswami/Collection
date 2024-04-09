package EnumPackage;

public class Manager extends Employee {
	private  ManagerType type;
    private Employee employee;
	public Manager(ManagerType type) {
		super();
		this.type = type;
	}
	public Manager() {
		super();
		this.type = type;
	}
	public void setSalary() {
		if(type==type.HR) {
		employee.setSalary(employee.getSalary()+10000);
		}
		else if(type==type.SALES) {
			employee.setSalary(getSalary()+5000);
		}
	}
	}
