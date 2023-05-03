package mypack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test222
{
	public static void main(String[] args) throws Exception
	{
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//way-1
		List<WebElement> l1=driver.findElements(By.xpath("(//*)[5]"));
		System.out.println(l1.get(0).getTagName());
		//way-2
		List<WebElement> l2=driver.findElements(By.xpath("//*"));
		System.out.println(l2.get(4).getTagName());

	}

}
