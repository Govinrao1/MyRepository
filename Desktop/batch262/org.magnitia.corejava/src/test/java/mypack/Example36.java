package mypack;

import java.util.Scanner;

public class Example36
{
	public static void main(String[] args)
	{
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		sc.close();
		//Check for prime or not
		int flag=0;
		for(int i=2;i<x;i++) //not divided by 2 to x-1
		{
			if(x%i==0)
			{
				flag=1;
				break; //terminate from current loop
			}
		} //loop will be terminated either "at end" or because of "break"
		if(flag==0)
		{
			System.out.printf("%d is a prime number",x);
		}
		else
		{
			System.out.printf("%d is not a prime number",x);
		}
	}
}







