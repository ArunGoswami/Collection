package feb27;

import java.util.Scanner;

public class Student {

	public Student getStudentObject()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Name");
	}
	public static void main(String[] args) {
		Student st=new Student();
		st.getStudentObject();
	}

}
