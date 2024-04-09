package jvm;

import java.util.Scanner;

public class ExcProgram03 
{
public void addLogic(int a,int b) 
{ 
   if(a<0||b<0) 
   {
     throw new IllegalArgumentException("don’t pass the -ve number");
   }
   else
   {
	int c=a+b;
	System.out.println("addition of the no:"+c);
    }
}

public static void main(String[] args) 
{
   Scanner sc=new Scanner(System.in); 
   System.out.println("enter the 2 number"); int a=sc.nextInt();
   int b=sc.nextInt();
   ExcProgram03 e5=new ExcProgram03();
   // e5.addLogic(a,b); 
      try 
      {
         e5.addLogic(a, b);
      }
      catch(IllegalArgumentException e) 
      {
         System.out.println(e.getMessage());
       }

   }

}
