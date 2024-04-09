package StringQuestion;

public class StringPattern2 {
	public static void main(String[] args) {                                         //J
	String str="java";
	for(int i=0; i<str.length(); i++) {           //j
		for(int j=0; j<=i; j++) {
			System.out.print(str.charAt(j));
		}
		System.out.println();
	}                             //J a
	}                            //J a v
	                              //J a v a
}
