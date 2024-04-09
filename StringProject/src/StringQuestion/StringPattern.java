package StringQuestion;

public class StringPattern {
  public static void main(String[] args) {
	String str="java";
	for(int i=0; i<str.length(); i++) {           //j
		for(int j=0; j<str.length(); j++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}                                  //java
	                                // j j j j
	                                //a a a a
	                                //v v v v
	                                //a a a a   
	                             
	
}
