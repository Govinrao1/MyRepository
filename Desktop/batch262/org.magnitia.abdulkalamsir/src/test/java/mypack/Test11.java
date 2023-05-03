package mypack;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11
{
	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver	driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.w3schools.com/tags/tag_input.asp");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Try it Yourself »")).click();
		Thread.sleep(5000);
		//get window handles of all browser windows/tabs
		Set<String> s=driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(s);
		//switch to 2nd tab/window and close it
		driver.switchTo().window(l.get(1));
		driver.close();
		//switch back to 1st window/tab
		driver.switchTo().window(l.get(0));
		driver.findElement(By.linkText("Try it Yourself »")).click();
		Thread.sleep(5000);
		//close all tabs
		driver.quit();	
	}
}







