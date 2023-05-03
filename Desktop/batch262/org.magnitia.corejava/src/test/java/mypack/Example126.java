package mypack;

import java.util.Random;
import org.apache.commons.lang.RandomStringUtils;

public class Example126
{
	public static void main(String[] args)
	{
		//Random Number
		Random r=new Random();
		System.out.println(r.nextInt(1000));
		//Random String
	    String str1=RandomStringUtils.randomAlphabetic(10);
	    System.out.println(str1);
	    //Random String
	    String str2=RandomStringUtils.randomAlphanumeric(10);
	    System.out.println(str2);
	}
}














