package mypack;

public class Example16
{
	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		//way-4
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("x is "+x);
		System.out.println("y is "+y);
	}
}
