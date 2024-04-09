package StringQuestion;

import java.util.Random;

public class Captchcode {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//        char[] ch = new char[6];
//        Random random = new Random();
//
//        for (int i = 0; i < 6; i++) {
//            // Generate a random index to get a character from str
//            int randomIndex = random.nextInt(str.length());
//            ch[i] = str.charAt(randomIndex);
//        }
//
//        // Print the generated captcha code
//        String captchaCode = new String(ch);
//        System.out.println("Generated Captcha Code: " + captchaCode);
//    }
        
     char[] ch=new char[4];
     Random random=new Random();
     for(int i=0; i<4; i++) {
    	 int value=random.nextInt(str.length());
    	 ch[i]=str.charAt(value);
     }
      String s=new String(ch);
      System.out.println(s);
        
        
      
        
    }
}
