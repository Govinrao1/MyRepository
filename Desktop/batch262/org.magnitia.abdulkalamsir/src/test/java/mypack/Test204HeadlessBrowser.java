package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test204HeadlessBrowser
{
	public static void main(String[] args) throws Exception
	{
		//open browser in headless mode
		ChromeOptions o=new ChromeOptions();
	    o.addArguments("--headless"); //native command as argument
	    WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(o);
		Thread.sleep(5000);
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		String x=driver.getTitle();
		System.out.println(x);
		driver.close();
	}
}
