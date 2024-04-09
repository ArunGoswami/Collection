package EnumPackage;

public class Clerk extends Employee {
	int speed;
	int accuracy;
	boolean increased = false;

	public Clerk(int speed, int accuracy) {
		super();
		this.speed = speed;
		this.accuracy = accuracy;
	}

	public Clerk() {
		super();
		this.speed = speed;
		this.accuracy = accuracy;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	@Override
	public void setSalary(double salary) {
		if (speed > 70 && accuracy > 80 && !(increased)) {
			salary += 1000;
			super.setSalary(salary);
			System.out.println(super.getSalary());
			increased = true;
		}
	}
}
