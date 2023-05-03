package mypack;

import java.util.Scanner;

public class Example93
{
	public static void main(String[] args)
	{
		//Take data from Keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String ms=sc.nextLine();
		System.out.println("Enter a substring");
		String ss=sc.nextLine();
		sc.close();
		//get index of all occurrences of sub-string in main-string including count of 
		                                                                   //occurrences
		int count=0;
		System.out.print("Positions are ");
		for(int i=0; i<ms.length(); i++)
		{
			if(ms.charAt(i)==ss.charAt(0))
			{
				int flag=0;
				for(int j=1,k=i+1; j<ss.length(); j++,k++)
				{	
					if(ms.charAt(k)!=ss.charAt(j))
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.print(i+" "); 
					count++;
				}
			}
		}	
		System.out.println();
		System.out.println("Count of occurrences is "+count);
	}
}
