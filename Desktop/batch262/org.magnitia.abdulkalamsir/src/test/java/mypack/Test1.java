package mypack;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1
{
	public static void main(String[] args)
	{
		//download latest chrome driver software
		WebDriverManager.chromedriver().setup();
		//Open chrome browser using that chrome driver software
		ChromeDriver driver=new ChromeDriver();
	}
}
