package mypack;

import java.util.Formatter;

public class Example31
{
	public static void main(String[] args)
	{
		//about flags
		Formatter f=new Formatter();
		//1. Use Space as flag with format specifier for alignment
        f.format("%d",-111);
        System.out.println(f);
        f=new Formatter();
        f.format("%d",111);
        System.out.println(f);
        f=new Formatter();
        f.format("% d",-222);
        System.out.println(f);
        f=new Formatter();
        f.format("% d",222);
        System.out.println(f);

        //2.+ sign specifier
        f=new Formatter();
        f.format("%+d",111);
        System.out.println(f);
        //+ sign specifier on - sign, it will have no effect
        f=new Formatter();
        f.format("%+d",-111);
        System.out.println(f);
     
        //3.( Specifier to enclose negative values only
        f=new Formatter();
        f.format("%(+d",-111);
        System.out.println(f);
        f=new Formatter();
        f.format("%(+d",111);
        System.out.println(f);
       
        //4. comma Specifier for denominations
        f=new Formatter();
        f.format("%, d",1000000);
        System.out.println(f);
        f=new Formatter();
        f.format("%, f",32659526566.4521);
        System.out.println(f); 
	}
}
