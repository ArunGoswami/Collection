package abs;

public class HistoryStudent extends student{
	 private int historyMarks;
	 private int  civicsMarks;
	
	public HistoryStudent(String studentClass,String studentName,int historyMarks, int civicsMarks) {
		super(studentName,studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}
	public   int  getPercentage() {
		int percentage= (historyMarks+civicsMarks)/100;
		return percentage;
	}
	@Override
	public String toString() {
		return "HistoryStudent [historyMarks=" + historyMarks + ", civicsMarks=" + civicsMarks + ", toString()="
				+ super.toString() + "]";
	}
	
}
