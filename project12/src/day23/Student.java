package day23;

public class Student {
private String studentName;
private int studentId;
private int studentfees;
private College clg;
public Student(String studentName, int studentId, int studentfees, College clg) {
	super();
	this.studentName = studentName;
	this.studentId = studentId;
	this.studentfees = studentfees;
	this.clg = clg;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentfees=" + studentfees + ", clg=" + clg + "]";
}

}
