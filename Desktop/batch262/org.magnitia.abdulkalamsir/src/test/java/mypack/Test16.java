package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test16
{
	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver	driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		//Do login
		driver.findElement(By.id("email")).sendKeys("abdulkalam");
		driver.findElement(By.id("pass")).sendKeys("batch262");
		driver.findElement(By.name("login")).click();
	}
}



















