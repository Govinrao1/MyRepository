package mypack;

import java.util.Scanner;

public class Example63
{
	public static void main(String[] args)
	{
		//Only for "String" class
		String x=new String("abdul kalam");
		System.out.println(x); //x is behaving like a variable
		x.length(); //x is behaving like an object to call method
		//For any class except "String"
		Scanner sc=new Scanner(System.in);
		System.out.println(sc); //sc is behaving like an object, Cannot behave like variable
		sc.close(); //sc is behaving like an object to call method
	}

}
