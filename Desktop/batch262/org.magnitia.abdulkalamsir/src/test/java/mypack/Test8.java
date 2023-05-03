package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test8 
{
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(); 
		driver.get("http://www.sentia.in");
		Thread.sleep(5000);
		String x=driver.getCurrentUrl();
		if(x.startsWith("https"))
		{
			System.out.println("site is secured");
		}
		else
		{
			System.out.println("site is not secured");
		}
		driver.close();
	}
}








