package Exception;

public class Invalidmarkexception extends RuntimeException {
	Invalidmarkexception(){
		
	}
	public static void main(String[] args) {
		try{
			if(100<=100) {
				throw new Invalidmarkexception();
			}
			else {
				System.out.println();
			}
		}
		catch(Exception e) {
			System.err.println("marks are inavalid");
		}
		
	}

}
