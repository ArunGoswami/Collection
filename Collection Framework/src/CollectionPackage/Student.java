package CollectionPackage;

import java.util.*;;

public class Student {
	 private  Integer studentId;
	 private  String studentName;
	 private  Double studentFees;
	 private  Date dateOfAdmission;
	 
	public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) {
		super();
		
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	public static Student getStudentObject()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr the Studentid");
		int studentId=scan.nextInt();
		
		System.out.println("Enetr the Studentname");
	  String studentName=scan.next();

	  System.out.println("Enetr the Studentfees");
		 Double studentFees=scan.nextDouble();   
		
		 System.out.println("Eneter the Studentdate of admission");
		 Date dateOfAdmission=new Date();
		return new Student(studentId, studentName, studentFees, dateOfAdmission);
	}
	
	 
	 }

