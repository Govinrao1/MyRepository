package mypack;

import java.util.Scanner;

public class Example83
{
	public static void main(String[] args)
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		sc.close();
		//count vowels
		int vc=0;
		int remaining=0;
		for(int i=0;i<x.length();i++) //0(1st char) to length-1(last char)
		{
			char y=x.charAt(i);
			switch(y)
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					vc++;
					break;
				default:
					remaining++;	
			}
		}
		System.out.println("Vowels count is "+vc);
		System.out.println("Remaining chars count is "+remaining);
	}
}
