package mypack;

import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3
{
	public static void main(String[] args)
	{
		//download latest iedriverserver software
		WebDriverManager.iedriver().setup();
		//open IE browser using that iedriverserver software
		InternetExplorerDriver driver=new InternetExplorerDriver();
	}
}
