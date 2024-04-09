package abs;

public abstract class student {
	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudent;

	public student() {

	}

	public student(String studentName, String studentClass) {
		super();
		this.studentClass = studentClass;
		totalNoOfStudent++;
	}

	public abstract int getPercentage();

	public static int getTotalNoStudents() {
		return totalNoOfStudent;
	}
	
}
