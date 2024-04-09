package StringQuestion;

public class LowerCase {
public static void main(String[] args) {
	String str="ravi";
	for(int i=0; i<str.length(); i++) {
       char ch= (char) (str.charAt(i)-32);
       System.out.print(ch);
	}
}
}
