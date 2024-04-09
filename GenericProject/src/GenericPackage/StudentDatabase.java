package GenericPackage;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
class studentmethod{
	HashMap<String,String> hm = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
	public  void addStudent() {
		
	Scanner scanner=new Scanner(System.in);	
	 String StudentName = scanner.next();
     String StudentGrade = scanner.next();
     if (hm.put(StudentName,StudentGrade) != null) 
		{
         System.out.println("Student already exists");
     } 
		else
		{
         System.out.println("Student added ");
     }
}
}
public class StudentDatabase
{
    public static void main(String[] args) 
		{
    	studentmethod s=new studentmethod();
        HashMap<String,String> hm = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) 
		{
            System.out.println("Options:");
            System.out.println("1. Add Student");
            System.out.println("2. Delete student");
            System.out.println("3. Exit");

            System.out.print("Enter your choice (1/2/3/4)");
            int choice = scanner.nextInt();

            switch (choice) 
			{
                case 1:
                    System.out.print("Enter thee Studentname and grader: ");
                  
                    break;
                    case 2:
                    System.out.print("Enter the element to delete: ");
                     StudentName = scanner.next();
                     StudentGrade = scanner.next();
                    if (hm.remove(StudentName, StudentGrade)) 
					{
                        System.out.println("Student deleted successfully.");
                    } 
					else 
					{
                        System.out.println("student deleted");
                    }
                    break;
                    case 3:
                    System.out.println("Students Information:");
                    System.out.println(hm);
                    break;
                    case 4:
                    System.out.println("Exiting");
                    System.exit(0);
                    default:
                    
            }

            System.out.println(); 
        }
    }
}

