package File;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayExample
{
     public static void main(String args[]) throws IOException
     {
			var fin = new FileInputStream("C:\\Batch27\\Cus.txt");

			var f1 = new FileOutputStream("C:\\Batch27\\a1.txt");  
			var f2 = new FileOutputStream("C:\\Batch27\\a2.txt");
			var f3 = new FileOutputStream("C:\\Batch27\\a3.txt"); 
			
			var bout = new ByteArrayOutputStream(); 

			try(fin; f1; f2; f3; bout)
		    {
             int i;
			while((i = fin.read()) != -1)
            {
               bout.write((byte)i); //writing tha data to ByteArrayOutputStream
            }

           bout.writeTo(f1);
           bout.writeTo(f2);
		   bout.writeTo(f3);
		   
           bout.flush();  //clear the buffer for reusing of ByteArrayOutputStream
           System.out.println("Success");
			}
			catch(IOException e)
		    {
				e.printStackTrace();
		    }
     }
}