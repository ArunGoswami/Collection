package StringQuestion;

public class CountWord {
    public static void main(String[] args) {
        String str = "Practice   java daily";
        int wordCount = 0;

        for (int i = 0; i < str.length(); i++) {
            
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
            if(str.charAt(i)== ' ' && str.charAt(i+1)==' ') {
            	wordCount--;
            }
        }

        
        if (str.charAt(0) == ' ') {
            wordCount--;
        }
        if (str.charAt(str.length() - 1) == ' ') {
            wordCount--;
        }

       
        System.out.println("Number of words: " + (wordCount + 1));
    }
}

