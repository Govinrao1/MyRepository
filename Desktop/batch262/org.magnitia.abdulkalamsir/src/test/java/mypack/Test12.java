package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test12 
{
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(); 
		driver.get("http://www.amazon.in");
		Thread.sleep(5000);
		String x=driver.getTitle();
		System.out.println(x);
		driver.close();
	}
}








