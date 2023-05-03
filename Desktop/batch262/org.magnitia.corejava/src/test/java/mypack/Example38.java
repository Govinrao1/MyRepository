package mypack;

import java.util.Scanner;

public class Example38
{
	public static void main(String[] args)
	{
		//Take limits from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower limit");
		long llimit=sc.nextLong();
		System.out.println("Enter upper limit");
		long ulimit=sc.nextLong();
		sc.close();
		//Print multiplication tables under given limit
		for(long i=llimit;i<=ulimit;i++)
		{
			//Take each "i" to create multiplication table
			System.out.println("Tabe for "+i);
			System.out.println("-------------");
			for(int j=1;j<=10;j++) 
			{
				System.out.printf("%d X %d=%d%n",i,j,i*j);
			}
			System.out.println("-------------");
		}
	}
}




