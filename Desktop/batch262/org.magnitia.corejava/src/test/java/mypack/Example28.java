package mypack;

import java.util.Formatter;

public class Example28
{
	public static void main(String[] args)
	{
		//Display plain Text
		System.out.println("My name is abdul kalam and age is 83");
		//About formatting ways
        //Way-1(only to display formatted output in eclipse console)
		//via "System.out.printf()" method.
        System.out.printf("My name is %s and age is %d","abdul kalam", 83);
        
        //Way-2(Get output into String variable)
        //via format() method "Formatter" class
        Formatter f=new Formatter();
        f.format("My name is %s  and age is %d","abdul kalam", 83);
        String x=f.toString();
        System.out.println(x);
        
        //Way-3(Get output into String variable)
        //via "format()" method in "String" class
        String y=String.format("My name is %s  and age is %d","abdul kalam", 83);
        System.out.println(y);
        
        //Way-4(Get output into String variable)
        //via "StringBuilder" class)
        StringBuilder sbuf=new StringBuilder();
        Formatter fmt=new Formatter(sbuf);
        fmt.format("My name is %s  and age is %d","abdul kalam", 83);
        String z=sbuf.toString();
        System.out.println(z);
        
	}
}




