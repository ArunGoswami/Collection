package abs;

public class StudentTester {
public static void main(String[] args) {
	ScienceStudent s=new ScienceStudent("A", "12th", 99, 99, 99);
	System.out.println(s);
	s.getPercentage();
	HistoryStudent s2=new HistoryStudent("A", "12th", 99, 99);
	System.out.println(s2);
	s2.getPercentage();
}
}
