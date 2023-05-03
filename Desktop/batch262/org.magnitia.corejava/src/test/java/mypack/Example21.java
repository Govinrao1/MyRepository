package mypack;

import java.util.Scanner;

public class Example21
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your rollno");
		int x=Integer.parseInt(sc.nextLine());
		//int x=sc.nextInt(); //nextByte(),nextShort(), nextLong(), nextBigInteger(), 
		//nextDouble(),nextBigDecimal()
		System.out.println("enter your name");
		String y=sc.nextLine();
	}
}
