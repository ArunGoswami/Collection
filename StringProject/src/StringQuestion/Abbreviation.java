package StringQuestion;

public class Abbreviation {
public static void main(String[] args) {
	String str="sachin ramesh tendulkar";
	System.out.print(str.charAt(0));
	for(int i=0; i<str.length(); i++) {
		if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
			System.out.print(str.charAt(i+1));
		}
	}
}
}
//wap for below requirement
//Enter two numbers in form of string 
//calculate and display the sum of the numbers