package StringQuestion;

public class EqualnumberofBracket {
    public static void main(String[] args) {
    String str="()()()()()))";
    int len=str.length();
    int open[]=new int[len];
    int close[]=new int[len];
    
    open[0]=0;
    close[len]=0;
    if(str.charAt(0)=='('){
      open[1]=1;    	
    }
    if(str.charAt(len)==')'){
        open[len-1]=1;    	
      }
    for(int i=1; i<len; i++) {
    	if(str.charAt(i)=='(') {
    		open[i+1]=open[1];
    	}
    	else {
    		open[i+1]=open[i];
    	}
    }
    for(int i=len-2; i>=1; i--) {
    	if(str.charAt(i)==')') {
    		close[i]=close[len-2];
    	}
    	else {
    		close[i]=close[i];
    	}
    }
    	
    	
  }
  }