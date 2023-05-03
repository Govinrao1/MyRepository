package mypack;

public class Example25
{
	public static void main(String[] args)
	{
		long x=1000*60*60*24*365; 
	    long y=1000*60*60*24*365L; 
	    System.out.println(x); //wrong output due to correct output size is more than 8 bytes
	    System.out.println(y); //Correct output because of memory expansion
	}
}
