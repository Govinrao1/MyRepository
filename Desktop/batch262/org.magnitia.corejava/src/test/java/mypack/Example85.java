package mypack;

import java.util.Scanner;

public class Example85
{
	public static void main(String[] args)
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		sc.close(); 
		//define count variables
		int clc=0;
		int cuc=0;
		int cd=0;
		int csc=0;
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			if(y>='a' && y<='z')   //if(y>=97 && y<=122)
			{
				clc++;
			}
			else if(y>='A' && y<='Z')  //else if(y>=65 && y<=90)
			{
				cuc++;
			}
			else if(y>='0' && y<='9') //else if(y>=48 && y<=57)
			{
				cd++;
			}
			else
			{
				csc++;
			}
		}
		System.out.println("lower case alphabet count is "+clc);
		System.out.println("upper case alphabet count is "+cuc);
		System.out.println("digits count is "+cd);
		System.out.println("Remaining chars count is "+csc);
	}
}
