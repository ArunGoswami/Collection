package StringQuestion;

public class Count {
public static void main(String[] args) {
	String str="ghee456$%^";
	int letter = 0;
	for(int i=0; i<str.length(); i++) {
		if(str.charAt(i)>=65 && str.charAt(i)<=122 ) {
			letter++;
		}
		else {
			
		}
	}
	System.out.println(letter);
}
}
