package mypack;

public class Example60
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++) 
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int k=1;k<(2*i);k++) 
			{
				System.out.print(" ");
			}
			for(int l=4;l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--) 
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int k=1;k<(2*i);k++) 
			{
				System.out.print(" ");
			}
			for(int l=4;l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
