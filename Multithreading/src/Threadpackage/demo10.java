package Threadpackage;


class Test10 extends Thread       
    {       
        static int k1, k2;          
              
        public void run()       
        {       
            while(true)       
            {       
                synchronized(Test.class)       
                {       
                    k1++;       
                    k2++;       
                      
                if(k1 <= k2)       
                {       
                    System.out.println("k1: " + k1 + " k2: " + k2);       
                    System.exit(0);       
                }  
               }     
            }       
        }
	}
public	class demo10
	{          
        public static void main(String[] args)       
        {       
            new Test10().start();       
            new Test10().start();       
        }       
  } 
