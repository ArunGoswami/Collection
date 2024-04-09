package Exception1;

public class InsufficientQuantityException extends RuntimeException{
	InsufficientQuantityException(){
		
	}
	InsufficientQuantityException(String message){
		super(message);
	}
}
