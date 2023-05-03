package mypack;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example124
{
	public static void main(String[] args)
	{
		//Way-1
		Date dt1=new Date();  
	    SimpleDateFormat f=new SimpleDateFormat("dd/MMM/yyyy hh-mm-ss");  
	    String strDate=f.format(dt1);  
	    System.out.println(strDate);
	}
}














