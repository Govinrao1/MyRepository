package mypack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class Test159
{
	public static void main(String[] args) throws Exception
	{
		//Single select drop down developed using <select> tag
		//Open browser
		WebSiteUtility wsobj=new WebSiteUtility();
		RemoteWebDriver driver=wsobj.openBrowser("chrome");
		//Define wait
		FluentWait<RemoteWebDriver> wait=wsobj.defineWait(driver);
		//Launch site
		wsobj.launchSite(driver,"https://www.amazon.in/");
		//Automate <select> tag drop-down
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(
				                                       By.id("searchDropdownBox")));
		Select s=new Select(e);
		//Test case-1: is it multi-select or not?
		if(s.isMultiple())
		{
			System.out.println("Multi-select drop down");
		}
		else
		{
			System.out.println("Single-select drop down");
		}
		//Test case-2: get all items and display
		List<WebElement> l=s.getOptions();
		for(WebElement i:l)
		{
			System.out.println(i.getText());
		}
		//Test case-3: select an item
		s.selectByIndex(9);
		Thread.sleep(5000);
		s.selectByVisibleText("Garden & Outdoors");
		Thread.sleep(5000);
		s.selectByValue("search-alias=industrial"); //copied from source code
		//close site
		wsobj.closeSite(driver);
	}
}





