package mypack;

import java.util.Scanner;

public class Example37
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
		//Print all prime numbers under given limit
		int count=0;
		for(long i=llimit;i<=ulimit;i++)
		{
			//Check each "i" value for prime or not in given range of values
		    int flag=0;
		    for(int j=2;j<i;j++) //2 to i-1
		    {
		    	if(i%j==0)
		    	{
		    		flag=1;
		    		break; 
		    	}
		    } //loop will be terminated either "at end" or at "break"
		    if(flag==0)
		    {
		    	System.out.printf("%d is a prime number%n",i);
		    	count++;
		    }
		}
		System.out.printf("Total count of prime numbers in given range is %d",count);
	}
}







