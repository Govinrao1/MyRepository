package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test28 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(); 
		//Launch site using base URL
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000); 
		//Close banner if exists
		try
		{
			driver.findElement(By.xpath(
			  "(//span[text()='Login'])[1]/preceding::button[1]")).click();
			Thread.sleep(5000); 
		}
		catch(Exception ex)
		{
			System.out.println("No banner this time");
		}
		//click on "mobiles" link
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		Thread.sleep(5000); 
		//click on "Xiaomi 11i" model
		driver.findElement(By.xpath(
				"(//img[@alt='big-bang-xiaomi11-120hypercharge'])[2]")).click();
		Thread.sleep(5000);
		//click on a sub model
		driver.findElement(By.xpath(
				"(//img[contains(@alt,'Pacific Pearl, 128 GB')])[1]")).click();
		Thread.sleep(5000);
		//switch to newly opened window/tab(2nd tab)
		Set<String> s=driver.getWindowHandles();
		List<String> l=new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));
		//get amount and display
		String x=driver.findElement(By.xpath(
				"//img[@id='price-info-icon']/preceding::div[3]")).getText();
		x=x.substring(1); //take text from 2nd position to avoid currency symbol
		x=x.replace(",",""); //remove , in value
		System.out.println(x);
		//close all browser windows/tabs
		driver.quit();
	}
}