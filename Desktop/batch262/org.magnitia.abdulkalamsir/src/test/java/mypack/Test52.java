package mypack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test52
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(); 
		//Launch google
		driver.get("https://www.google.co.in");
		Thread.sleep(5000); 
		//collect all elements
		List<WebElement> l=driver.findElements(By.xpath("//*"));
		System.out.println(l.size());
		//close site
		driver.close();
	}
}





