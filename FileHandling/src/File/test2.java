package File;

import java.util.Scanner;

public class test2 {
	 public static void main(String[] args) throws InvalidCharacerException {
			Scanner scan=new Scanner(System.in);
			char vowel=scan.next().charAt(0);
			try {
				if(vowel=='a'|| vowel=='A'|| vowel=='e'|| vowel=='E' || vowel=='i'|| 
						vowel=='I' || vowel=='o'|| vowel=='0' || vowel=='u'|| vowel=='u') {
					System.out.println("valid vowel");
				}
				else {
					throw new InvalidCharacerException("not a vowel");
				}
			}
			catch(InvalidCharacerException e) {
				System.err.println("InvalidAdharcard occured");
			}
		}
}
