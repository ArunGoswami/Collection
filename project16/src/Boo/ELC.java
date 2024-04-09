package Boo;

import java.util.Scanner;

public class ELC 
{
	public static Book getBookObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter title of the book :");
		String title = sc.nextLine();
		System.out.print("Enter Autor's Name of the book :");
		String author = sc.nextLine();
		
		Book b1 = new Book(title, author);
		return b1;
		
		
	}
	public static void main(String[] args)
	{
       Book object = getBookObject();
       System.out.println("Book Title is :"+object.getBookTitle());
       System.out.println("Author Name is :"+object.getAuthorName());
	}
	

	

}
