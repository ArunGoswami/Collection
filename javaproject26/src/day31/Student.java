package day31;

public class Student {

	private int i;
	private String string;
	public Student(int i, String string) {
		// TODO Auto-generated constructor stub
		this.i=i;
		this.string=string;
	}
	@Override
  public boolean equals(Object obj){
	  Student s2= (Student)obj;
	  if((this.i==s2.i) && this.string==s2.string) {
		  return true;
	  }
	return false;
  }
}
