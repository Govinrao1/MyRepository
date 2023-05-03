package mypack;

public class Example129_3
{
	public static void main(String[] args)
	{
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException ex)
		{
			System.out.println("Hi");
		}
	}
}
