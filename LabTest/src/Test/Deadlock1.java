package Test;
public class Deadlock1
	{
  public static void main(String[] args) 
	 {
     String str = "A";  
     String str1 = "S";  

   
    Thread t1 = new Thread() 
		{
	  @Override
      public void run() {
	  synchronized (str) 
	 {
			   System.out.println(str);
			      try 
				   { 
				   Thread.sleep(1000);
				   } 
				   catch (Exception e) 
				   {
					   System.out.println("exception occured");
				   }
				  
			   synchronized (str1) 
			   {
				System.out.println("str");
			   }
             }
      }
    };


    
    Thread t2 = new Thread() {
      @Override
      public void run() 
	  {
        synchronized (str1) 
			{
          System.out.println("str1");
              try 
			  { 
			  Thread.sleep(1000);
			  } 
			  catch (Exception e) 
			{
				  System.out.println("Exceptin occured");
			}

          synchronized (str1) {	
            System.out.println("str");
          }
			}
      }
    };    
    t1.start();
    t2.start();
  }

	}

