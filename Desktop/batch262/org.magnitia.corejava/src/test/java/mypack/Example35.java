package mypack;

import java.util.Scanner;

public class Example35
{
	public static void main(String[] args)
	{
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		sc.close();
		//Check for even or odd
		if(x%2==0)
		{
			System.out.printf("%d is an even number",x);
		}
		else
		{
			System.out.println(x+" is an odd number");
		}
	}
}




