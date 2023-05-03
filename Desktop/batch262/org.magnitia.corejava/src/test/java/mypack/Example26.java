package mypack;

public class Example26
{
	public static void main(String[] args)
	{
		float x=(float) (1000*6000000.56789); 
	    float y=1000*6000000.56789F; 
	    System.out.println(x); //wrong output due to correct output size is more than 8 bytes
	    System.out.println(y); //Correct output because of memory expansion
	}
}
