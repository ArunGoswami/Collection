package File;

import java.util.Scanner;

public class InvalidAdharcard extends RuntimeException {
	InvalidAdharcard(){
		 
	 }
	InvalidAdharcard(String message){
		 super(message);
	 }

}
