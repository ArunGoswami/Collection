package File;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class RetrievingEmployeeObject 
{
	public static void main(String[] args) throws Exception 
	{
		var fin = new FileInputStream("C:\\Batch27\\Empdata.txt");
		var ois = new ObjectInputStream(fin);

		try(fin; ois)
		{
			Employee emp = null;
			while((emp = (Employee)ois.readObject())!=null)
			{
				System.out.println(emp);
			}
			
		}
		catch(EOFException e)
		{
			System.err.println("End of file reached!!!");
			
		}
		
	}
}

