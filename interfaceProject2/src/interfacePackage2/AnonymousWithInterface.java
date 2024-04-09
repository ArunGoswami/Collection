package interfacePackage2;


interface Student
{
	void writeExam();
}

public interface AnonymousWithInterface 
{
 public static void main(String[] args) 
 {
	Student science = new Student()
	{
		@Override
		public void writeExam() 
		{
		  System.out.println("Science students are Writing the Exam");					
		}		
	};
	
	Student commerce = new Student()
	{
		@Override
		public void writeExam() 
		{
		  System.out.println("Commerce students are Writing the Exam");					
		}		
	};
	   science.writeExam();
	   commerce.writeExam();
 }
}