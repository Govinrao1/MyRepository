package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test10
{
	public static void main(String[] args)
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver	driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.google.co.in");
		//get handle value of current browser window/tab
		String x=driver.getWindowHandle();
		System.out.println(x);
		//close site
		driver.close();
	}
}







