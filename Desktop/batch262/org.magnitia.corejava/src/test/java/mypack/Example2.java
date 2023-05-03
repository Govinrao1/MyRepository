package mypack;

public class Example2
{
	public static void main(String[] args)
	{
		int x=10;
		{
			int y=20;
			System.out.println(x);
			System.out.println(y);
		} //y lifetime go to end
		System.out.println(x);
	}//x life time go to end
}
