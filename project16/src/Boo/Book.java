
package Boo;

import java.util.Scanner;

public class Book 
{
   private String bookTitle;
   private String authorName;
   
   public Book(String bookTitle, String authorName) 
	{
		super();
		this.bookTitle = bookTitle;
		this.authorName = authorName;
	}

	public String getBookTitle() 
	{
		return bookTitle;
	}

	public String getAuthorName() 
	{
		return authorName;
	}
   
	
}
