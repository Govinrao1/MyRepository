package mypack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test83
{
	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site 
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("//*")); //all elements
		//check each element
		int vec=0;
		int hec=0;
		for(WebElement e:l)
		{
			if(e.isDisplayed())
			{
				vec++;
			}
			else
			{
				hec++;
			}
		}
		System.out.println("Visible elements count is "+vec);
		System.out.println("Hidden elements count is "+hec);
		//close site
		driver.close();
	}
}
