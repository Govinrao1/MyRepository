package mypack;

import java.util.Scanner;

public class Example79
{
	public static void main(String[] args)
	{
		//Get two words from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st word");
		String x=sc.nextLine();
		System.out.println("Enter 2nd word");
		String y=sc.nextLine();
		sc.close();
		System.out.println("Before swap:");
		System.out.printf("%s %s%n",x,y);
		//Swapping
		String temp="";
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swap:");
		System.out.printf("%s %s%n",x,y);
	}
}





