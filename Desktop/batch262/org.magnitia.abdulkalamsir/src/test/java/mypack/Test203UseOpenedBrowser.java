package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test203UseOpenedBrowser
{
	public static void main(String[] args)
	{
		//connect to existing browser
		ChromeOptions o=new ChromeOptions();
	    o.setExperimentalOption("debuggerAddress","localhost:58314");
	    WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(o);
		driver.get("http://www.google.co.in");
	}
}
