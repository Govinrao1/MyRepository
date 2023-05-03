package mypack;

import java.util.Scanner;

public class Example20
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String x=sc.nextLine();
		System.out.println("enter a char");
		char y=sc.nextLine().charAt(0);
	}
}
