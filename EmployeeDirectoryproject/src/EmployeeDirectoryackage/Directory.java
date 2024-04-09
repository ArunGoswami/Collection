package EmployeeDirectoryackage;

import java.util.ArrayList;

public class Directory {
ArrayList<Employee> employeeList=new ArrayList<Employee>();


public Directory(ArrayList<Employee> employeeList) {
	super();
	this.employeeList = employeeList;
}


public void addemployee(Employee employee) {
	employeeList.add(employee);
}
public void displayAllEmployees() {
	for(Employee existemployee:employeeList) {
		System.out.println(existemployee);
	}
}
public void deleteEmployee(Employee employee) {
	employeeList.remove(employee);
}
}
