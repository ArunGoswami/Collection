package CollectionPackage2;

import java.util.HashMap;
import java.util.Scanner;

public class Address {
public static void main(String[] args) {
	HashMap<String, Integer> hs=new HashMap<String, Integer>();
	Scanner scan=new Scanner(System.in);
	while(true) {
		System.out.println("Enter your choice");
		System.out.println("1:Enter the name to add");
		System.out.println("1:Enter the name to remove");
		System.out.println("1:Exit");
		
		System.out.println("Enter the choice");
		int choice=scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter the name to add");
			String name=scan.next();
			scan.next();
			boolean namepresent=hs.containsKey(name);
			if(namepresent) {
				System.out.println("Name Already exist");
			}
			else {
				hs.put(name, 1223344);
				System.out.println("Student name Added");
			}
			break;
			
		case 2:
			System.out.println("Enter the name to remove");
		   name=scan.next();
			scan.next();
			boolean namepresent1=hs.containsKey(name);
			if(namepresent1) {
				hs.remove(name);
				System.out.println("name removed");
			}
			else {
				System.out.println("not present");
			}
			break;
		case 3:
			System.out.println("Exit the program");
			System.exit(0);
		}
	}
}
}
