package mypack;

import java.util.Scanner;

public class Example69
{
	public static void main(String[] args)
	{
		//Get a string from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=sc.nextLine();
		sc.close();
		//Reverse the given word
		String reverse=""; //empty string
		int l=word.length();
		for(int i=l-1;i>=0;i--) //last index to first index
		{
			char c=word.charAt(i);
			reverse=reverse+c;
		}
		System.out.printf("%s is reversed word of %s%n",reverse,word);
		//Check for Palindrome
		if(word.equals(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}







