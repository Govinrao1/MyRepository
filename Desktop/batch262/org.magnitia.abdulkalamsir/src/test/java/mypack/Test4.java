package mypack;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4
{
	public static void main(String[] args)
	{
		//download latest msedgedriver software
		WebDriverManager.edgedriver().setup();
		//open edge browser using that msedgedriver software
		EdgeDriver driver=new EdgeDriver();
	}
}
