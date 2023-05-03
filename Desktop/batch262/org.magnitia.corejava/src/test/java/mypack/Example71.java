package mypack;

public class Example71
{
	public static void main(String[] args)
	{
		String x="my name is kalam";
		String y=x.substring(3,60); //"StringIndexOutOfBoundsException" will come
		System.out.println(y);
	}
}
