package File;

public class LowBalanceException extends Exception {
	LowBalanceException(){
		 
	 }
	LowBalanceException(String message){
		 super(message);
	 }
}
