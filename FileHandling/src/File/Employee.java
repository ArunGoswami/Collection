package File;

import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable{
private Integer EmpId;
private String Empname;
private double EmpSal;
public Employee(Integer empId, String empname, double empSal) {
	super();
	EmpId = empId;
	Empname = empname;
	EmpSal = empSal;
}
public static Employee getEmployeeObject() {
	Scanner scan=new Scanner(System.in);
	int EmpId=scan.nextInt();
	String Empname=scan.nextLine(); Empname=scan.nextLine();
	double EmpSal=scan.nextInt();
	return new Employee(EmpId, Empname, EmpSal);
	
}

}
