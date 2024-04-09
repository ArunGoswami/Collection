package StringQuestion;

public class tocharArray {
public static void main(String[] args) {
	String str="core java";
	char ch[]=str.toCharArray();
	for(int i=0; i<str.length(); i++) {
		System.out.println(ch[i]);

	}
	System.out.println(str.contains("java"));
}
}
