package abs;

public abstract class Book {
	 String title;
	 public Book(String title) {
	}
	public abstract void setTitle(String title) ;
	public String getTitle()
{
	return title;
		
		}
	public void getTitle(String title) {
	System.out.println(title);	
	}
}
