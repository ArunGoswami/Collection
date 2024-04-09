package Inter;

public class Supervisor extends Employee {

	int numberOfSubordinates;
	public Supervisor(String name, int employeeId,int numberOfSubordinates) {
		super(name, employeeId);
		this.numberOfSubordinates=numberOfSubordinates;
	}

	@Override
	public int calculateSalary() {
		int salary=30000;
		return salary;
	}

	@Override
	public int generatePayStub() {
		int paystub=10000;
		return paystub;
	}
	public String  numberOfSubordinates() {
		 return "10";
	 }

	@Override
	public String toString() {
		return "Supervisor [numberOfSubordinates=" + numberOfSubordinates + ", calculateSalary()=" + calculateSalary()
				+ ", generatePayStub()=" + generatePayStub() + ", numberOfSubordinates()=" + numberOfSubordinates()
				+ "]";
	}
	
}
