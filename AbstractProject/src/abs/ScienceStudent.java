package abs;

public class ScienceStudent extends student {
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	
   public ScienceStudent(String studentClass,String studentName,int physicsMarks, int chemistryMarks, int mathsMarks) {
		super(studentName,studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}


@Override
	public   int  getPercentage() {
	   int percentage= (physicsMarks+chemistryMarks+mathsMarks)/100;
		return percentage;
	}


@Override
public String toString() {
	return "ScienceStudent [physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
			+ mathsMarks + ", studentName=" + studentName + ", studentClass=" + studentClass + ", toString()="
			+ super.toString() + "]";
}

}
