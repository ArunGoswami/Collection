package File;

import java.util.Scanner;

public class test {
	 public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			String adharno=scan.nextLine();
			try {
				if(adharno.length()==12) {
					System.out.println("valid adharno");
				}
				else {
					throw new InvalidAdharcard("number is invalid");
				}
			}
			catch(InvalidAdharcard e) {
				System.err.println("InvalidAdharcard occured");
			}
		}
}
