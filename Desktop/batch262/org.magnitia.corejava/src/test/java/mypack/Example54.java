package mypack;

import java.util.Scanner;

public class Example54
{
	public static void main(String[] args)
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows count");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Enter symbol");
		char c=sc.nextLine().charAt(0);
		sc.close();
		for(int i=1;i<=n;i++) //rows
		{
			for(int j=n-1;j>=i;j--) //spaces
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) //symbols
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
