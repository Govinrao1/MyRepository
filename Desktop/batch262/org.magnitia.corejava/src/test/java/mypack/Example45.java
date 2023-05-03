package mypack;

import java.util.Scanner;

public class Example45
{
	public static void main(String[] args)
	{
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt(); //original number
		sc.close();
		
		int y=0; //initially reverse number is 0
		int temp=x; //copy original value into temporary variable
		while(temp!=0)
		{
			int r=temp%10; //get last digit
			y=y*10+r; //add to reverse at end
			temp=temp/10; //cut last digit
		}
		System.out.println(y);
		//compare reverse number with original number
		if(x==y)
		{
			System.out.println(x+" is palindrome");
		}
		else
		{
			System.out.println(x+" is not palindrome");
		}
	}
}
