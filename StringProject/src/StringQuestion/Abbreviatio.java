package StringQuestion;

public class Abbreviatio {
public static void main(String[] args) {
	String str="jay Saggannath";
	System.out.print(str.charAt(0));
	for(int i=0; i<str.length(); i++) {
		if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
			System.out.print(str.charAt(i+1));
		}
	}
}
}
