package File;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class RetrievestudentObject {
public static void main(String[] args) throws Exception {
			{
			var fin = new FileInputStream("C:\\Batch27\\ab.txt");
			var ois = new ObjectInputStream(fin);

			try(fin; ois)
			{
				Student stud = null;
				while((stud = (Student)ois.readObject())!=null)
				{
					System.out.println(stud);
				}
				
			}
			catch(EOFException e)
			{
				System.err.println("End of file reached!!!");
				
			}
			
		}
	}


}
