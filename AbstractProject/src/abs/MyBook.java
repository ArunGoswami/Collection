package abs;

public class MyBook extends Book {
	
	MyBook(String title){
		super(title);
		this.title=title;
	}
	@Override
	public void setTitle(String title) {
	System.out.println("The title of my book is:");	
	}
	@Override
	public void getTitle(String title) {
	System.out.println(title);	
	}
	@Override
	public String toString() {
		return "MyBook [title=" + title + "]";
	}
	
}
