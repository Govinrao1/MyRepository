package mypack;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 
{
	public static void main(String[] args)
	{
		//download latest operadriver software
		WebDriverManager.operadriver().setup();
		//open opera browser using that operadriver software
		//OperaDriver driver=new OperaDriver();
		//no opera support in latest versions of SWD
	}
}













