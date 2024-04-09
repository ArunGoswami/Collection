package Exception1;

public class InvalidAmountException extends Exception {
	InvalidAmountException(){
		
	}
	InvalidAmountException(String message){
		super(message);
	}
}
