package jvm;


public class CreateObjectDynamically
{
   public static void main(String [] args) throws Exception
   {
       Object  obj =  Class.forName(args[0]).newInstance();
       System.out.println("Object created for  :"
       + obj.getClass().getName()+" class");
   }
}
