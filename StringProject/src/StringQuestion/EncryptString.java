package StringQuestion;

public class EncryptString {
public static void main(String[] args) {
	String str="abcd";
	int c=1,i;
	for( i=0; i<str.length()-1; i++) {
		if(str.charAt(i)==str.charAt(i+1)) {
			c++;
		}
		if(c>0) {
			System.out.print(str.charAt(i)+""+c);
		}
	}
}
}
