package mypack;

public class Example66
{
	public static void main(String[] args)
	{
		//Only for "String" class
		String x1="abdul kalam";
		String x2=new String("abdul kalam");
		//1. values comparison
		if(x1.equals(x2)) //here "equals()" method is belongs to "String" class
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
		//2. objects comparison(objects details comparison)
		if(x1==x2) //"==" in between objects and "equals()" in "Object" class both are same
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
	}
}
