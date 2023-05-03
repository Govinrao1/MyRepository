package mypack;

public class Example53
{
	public static void main(String[] args)
	{
		for(int i=5;i>=1;i--) //rows
		{
			for(int j=1;j<=i;j++) //columns
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
