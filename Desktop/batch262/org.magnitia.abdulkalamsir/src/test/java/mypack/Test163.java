package mypack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import org.openqa.selenium.support.ui.FluentWait;

public class Test163
{
	public static void main(String[] args) throws Exception
	{
		//Open browser and launch site
		WebSiteUtility wsobj=new WebSiteUtility();
		RemoteWebDriver driver=wsobj.openBrowser("chrome");
		//Define wait
		FluentWait<RemoteWebDriver> wait=wsobj.defineWait(driver);
		//Launch site
		wsobj.launchSite(driver,"http://www.google.co.in");
		//Locate an element via visual relations with other elements in page
		WebElement e1=driver.findElement(
				    By.xpath("(//form[@role='search']//*[name()='svg'])[1]")); //search
		WebElement e2=driver.findElement(
			By.xpath("//div[@aria-label='Search by voice']//*[name()='svg']")); //mic
		
		RelativeBy rb=RelativeLocator.with(By.xpath("//div"));
		List<WebElement> targets=driver.findElements(rb.toRightOf(e1).toLeftOf(e2));
		System.out.println(targets.size());
		for(WebElement target:targets)
		{
			driver.executeScript("arguments[0].style.border='5px dotted blue';",target);
			Thread.sleep(5000);
		}
	}
}
