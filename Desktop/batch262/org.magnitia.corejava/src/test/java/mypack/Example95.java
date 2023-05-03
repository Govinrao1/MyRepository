package mypack;

import java.util.Scanner;

public class Example95
{
	public static void main(String[] args) 
	{
		//Take a word
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		sc.close(); 
		//reverse string 
		String y=""; //empty string
		for(int i=x.length()-1; i>=0; i--) //from last char to 1st char
		{
			y=y+x.charAt(i);
		}
		System.out.println(y);
		if(x.equals(y))
		{
			System.out.println(x+" is palyndrome");
		}
		else
		{
			System.out.println(x+" is not palyndrome");
		}
	}
}
