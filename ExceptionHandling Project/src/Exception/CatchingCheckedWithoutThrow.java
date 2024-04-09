package Exception;

import java.io.IOException;

public class CatchingCheckedWithoutThrow 
{
	public static void main(String[] args) 
	{
		try
		{
			throw new IOException();
		}
		catch(IOException e) 
		{
			System.err.println("Input Output Exception");
		}

	}

}
