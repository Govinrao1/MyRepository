package mypack;

public class Example13
{
	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		//way-1
		int z=x;
		x=y;
		y=z;
		System.out.println("x is "+x);
		System.out.println("y is "+y);
	}
}
