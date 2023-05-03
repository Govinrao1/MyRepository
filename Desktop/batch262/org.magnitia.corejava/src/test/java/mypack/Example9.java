package mypack;

public class Example9
{
	public static void main(String[] args)
	{
		//Compare two variables(values)
		int a=10;
		int b=10;
		if(a==b)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		//Compare two objects(memory addresses)
		String x=new String("kalam");
		String y=new String("kalam");
		if(x==y)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
	}
}
