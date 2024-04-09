package day26;

public class Classtest {
public double calculatetax(Employee e1) {
	if(e1.calculateSalary()>=50000) {
		return e1.calculateSalary()*0.20;
	}
	else {
		return e1.calculateSalary()*0.05;
	}
	public double calculatetax(Manager m1) {
		if(m1.calculateSalary()>=50000) {
			return m1.calculateSalary()*0.20;
		}
		else {
			return m1.calculateSalary()*0.05;
		}
		public double calculatetax(Trainer t1) {
			if(t1.calculateSalary()>=50000) {
				return t1.calculateSalary()*0.20;
			}
			else {
				return t1.calculateSalary()*0.05;
			}
			public double calculatetax(Sourcing s1) {
				if(s1.calculateSalary()>=50000) {
					return s1.calculateSalary()*0.20;
				}
				else {
					return s1.calculateSalary()*0.05;
				}
}
}
