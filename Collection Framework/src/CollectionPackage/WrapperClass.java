package CollectionPackage;

public class WrapperClass
{
	public static void main(String[] args) 
	{
		int a = 12;
		Integer x = Integer.valueOf(a); //Upto 1.4 version
		System.out.println(x);
         
		int b=12;
		Integer y=Integer.valueOf(b);
		System.out.println(b);
		
        int y1 = 15;
		Integer i = y1;   //From 1.5 onwards compiler takes care
		System.out.println(i);	
		
		String str="111";
		Integer i1=Integer.parseInt(str,2);
		System.out.println(i1);
	}
}