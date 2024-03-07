package CollectionPackage2;

import java.util.HashSet;
import java.util.Scanner;

public class SocialMedia
{
    public static void main(String[] args) 
		{
        HashSet<String> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) 
		{
            System.out.println("Options:");
            System.out.println("1. Add Username ");
            System.out.println("2. Delete Username ");
            System.out.println("3. Display Username ");
            System.out.println("4. Exit");

            System.out.print("which operation you want to perform (1/2/3/4): ");
            int choice = scanner.nextInt();

            switch (choice) 
			{
                case 1:
                    System.out.print("Enter the username to add: ");
                    String Username  = scanner.next();
                    if (hashSet.add(Username )) 
					{
                        System.out.println("Username added successfully.");
                    } 
					else
					{
                        System.out.println("Username  already exists in the HashSet.");
                    }
                    break;
                    case 2:
                    System.out.print("Enter the element to delete: ");
                    String UsernameToDelete = scanner.next();
                    if (hashSet.remove(UsernameToDelete)) 
					{
                        System.out.println("Username  deleted successfully.");
                    } 
					else 
					{
                        System.out.println("Element not found in the HashSet.");
                    }
                    break;
                    case 3:
                    System.out.println("Username  in the HashSet:");
                    for (String Username1  : hashSet) {
                        System.out.println(Username1 );
                    }
                    break;
                    case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); 
        }
    }
}

