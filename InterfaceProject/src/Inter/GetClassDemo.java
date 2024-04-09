package Inter;

public class GetClassDemo 
{
	public static void main(String[] args)
	{
		GetClassDemo gcd = new GetClassDemo();
		System.out.println(gcd.toString() );

	}
	public String toString()
	{
		return getClass().getName()+" @ "+Integer.toHexString(hashCode());   
	}

}
