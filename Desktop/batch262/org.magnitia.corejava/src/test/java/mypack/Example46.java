package mypack;

import java.util.Scanner;

public class Example46 
{
	public static void main(String[] args)
	{
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		long x=sc.nextInt(); //original number
		sc.close();
		//Calculate no: of digits in given number
		long temp1=x; //take original number
		int count=0;
		while(temp1!=0)
		{
			temp1=temp1/10; //cut digit
			count++;
		}
		System.out.printf("No: of digits in %d is %d%n",x,count);
		//Calculate sum of armstrong equation
		long temp2=x; //take original number
		long value=0;
		while(temp2!=0)
		{
			int d=(int) (temp2%10); //get last digit
			value=(long) (value+Math.pow(d,count));
			temp2=(long)temp2/10; //cut last digit
		}
		//compare output value with original number for for Armstrong
		if(value==x)
		{
			System.out.printf("%d is Armstrong number",x);
		}
		else
		{
			System.out.printf("%d is not Armstrong number",x);
		}
	}
}
