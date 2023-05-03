package mypack;

public class Example58
{
	public static void main(String[] args)
	{
		//upper triangle
		for(int i=1;i<=5;i++) 
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print(2*k-1);
			}
			for(int l=i;l>1;l--)
			{
				System.out.print(2*l-3);
			}
			System.out.println();
		}
		//Lower triangle
		for(int i=4;i>=1;i--) 
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print(2*k-1);
			}
			for(int l=i;l>1;l--)
			{
				System.out.print(2*l-3);
			}
			System.out.println();
		}
	}
}
