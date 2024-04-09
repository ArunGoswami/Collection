package Exception;

class Age extends Exception
{
	Age(){
		
	}
	Age(String str){
		super(str);
	}
}

public class ExceptionHandling 
{
	public static void main(String[] args) {
		try {
			throw new Age();
		} catch (Age e) {
			System.out.println("Exception "+e.getMessage());
		}
		
	}

	public void nit() {
		// TODO Auto-generated method stub
		
	}
}