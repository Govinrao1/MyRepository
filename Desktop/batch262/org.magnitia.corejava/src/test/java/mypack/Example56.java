package mypack;

public class Example56
{
	public static void main(String[] args)
	{
		for(int i=5;i>=1;i--) //rows
		{
			//for spaces
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<(2*i);j++) //columns
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
