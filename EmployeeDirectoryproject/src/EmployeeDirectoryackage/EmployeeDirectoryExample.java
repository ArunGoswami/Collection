package EmployeeDirectoryackage;

import java.util.ArrayList;

public class EmployeeDirectoryExample {
public static void main(String[] args) {
	Directory directory=new Directory(new ArrayList<Employee>());
	Employee sonu=new Employee("sonu", 1, 10000);
	Employee monu=new Employee("monu", 1, 10000);
	directory.addemployee(monu);
	directory.addemployee(sonu);
	directory.displayAllEmployees();
	
}
}
