package mypack;

import java.util.Scanner;

public class Example48
{
	public static void main(String[] args)
	{
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a binary number");
		int n=sc.nextInt();
		sc.close();
		//binary to decimal
		//way-1
		String s=n+""; //give binary number as String as per syntax
		int d=Integer.parseInt(s,2); 
		System.out.println(n+" decial value is "+d); 
		//Way-2
		int decvalue=0; 
	    int p=0; 
	    int temp=n; 
	    while(temp!=0) 
	    { 
	        int lastdigit=temp%10; //get last digit
	        temp=temp/10; //cut that digit from binary number
	        decvalue=(int) (decvalue+lastdigit*power(2,p)); 
	        p++; 
	    } 
	    System.out.println(n+" decial value is "+decvalue);
	}
	
	public static long power(int base, int exp)
	{
		long output=1;
		for(int i=1;i<=exp;i++)
		{
			output=output*base;
		}
		return(output);
	}
}



