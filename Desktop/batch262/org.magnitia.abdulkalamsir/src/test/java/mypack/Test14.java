package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test14
{
	public static void main(String[] args)
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver	driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.gmail.com");
		//Define locator(create an object to "By" class)
		By b=By.name("hiddenPassword");
		//find element in page source using that locator
		WebElement e=driver.findElement(b);
		//operate that element in page
		e.sendKeys("hi students please wakeup");
	}
}



















