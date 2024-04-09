package day22;

public class Student {

	private String studentName ;
	private int studentId;
	private char grade;
    private int marks;
	 
    public void setStudentdata(int studentId,String Studentname,int marks) {
    	this.studentId=studentId;
    	this.studentName=studentName;
    	this.marks=marks;
    }
    public void calculateGrade() {
    	if(marks>90) {
    		System.out.println("A");
    	}
    	else if(marks>90) {
    		System.out.println("B");
    	}
    	else if(marks>80) {
    		System.out.println("C");
    	}
    	else if(marks>70) {
    		System.out.println("D");
    	}
    	else {
    		System.out.println("E");
    	}
    	
    	
    }
    
@Override
public String toString() {
	return "StudentId is"+studentId+"StudentName is"+studentName+"Studentmarks is"+marks;
}
public static void main(String[] args) {
  Student anu=new Student();
  anu.setStudentdata(123,"anur",91);
  System.out.println(anu);
  anu.calculateGrade();
}
}

