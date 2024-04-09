package CollectionPackage2;

import java.util.HashMap;
import java.util.Scanner;

record Students(String name, String grade) {

}

public class StudentTest {
	public static void main(String[] args) {
		HashMap<String, String> hs = new HashMap<String, String>();
		hs.put("ABC", "A");
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Option");
			System.out.println("1. Add Student Grade");
			System.out.println("2. Remove Student Grade");
			System.out.println("3. Exit");

			System.out.println("Enter your choice ");
			int choice = Integer.parseInt(
					scan.nextLine());
			switch (choice) {
			case 1:
				System.out.println("Enter Student name : ");
				String name = scan.nextLine();
				boolean containsKey = hs.containsKey(name);
				if (containsKey) {
					System.out.println("Already exist");
				} else {
					hs.put(name, "A");
					System.out.println("Student added Successfully");
				}
				break;
			case 2:
		     name = scan.nextLine();
			 containsKey = hs.containsKey(name);
				if(hs.isEmpty()) {
					System.out.println("Student list is empty");
				}
				else if(containsKey){
					System.out.println(hs.remove(name));
				}
				else {
					System.out.println("Student not found");
				}
				break;
			case 3:
				System.out.println("Exit the program");
				System.exit(0);
			
			}

		}
	}
}
