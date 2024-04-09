package File;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {

 String student_name;
 int student_id;
 transient String emailId; 
 String Address;
public Student(String student_name, int student_id, String emailId, String address) {
	super();
	this.student_name = student_name;
	this.student_id = student_id;
	this.emailId = emailId;
	Address = address;
}
public static Student getStudentObject() {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("enetr the id");
	int student_id=scan.nextInt();
	
	System.out.println("enetr the name");
	 String student_name=scan.nextLine();
	 student_name=scan.nextLine();
	 
	System.out.println("enetr the emailid");
	String emailId=scan.nextLine();
	
	System.out.println("enetr the emailid");
	String address=scan.nextLine();
	
	return new Student(address, student_id, address, address);
	
}
@Override
public String toString() {
	return "Student [student_name=" + student_name + ", student_id=" + student_id + ", Address=" + Address + "]";
}
/**
 * @return the student_name
 */
public String getStudent_name() {
	return student_name;
}



public void setStudent_name(String student_name) {
	this.student_name = student_name;
}


public int getStudent_id() {
	return student_id;
}

public void setStudent_id(int student_id) {
	this.student_id = student_id;
}

public String getEmailId() {
	return emailId;
}


public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getAddress() {
	return Address;
}


public void setAddress(String address) {
	Address = address;
}

}
