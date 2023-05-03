package mypack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Test161
{
	public static void main(String[] args) throws Exception
	{
		//single select drop down developed using <div> tag
		//Open browser
		WebSiteUtility wsobj=new WebSiteUtility();
		RemoteWebDriver driver=wsobj.openBrowser("chrome");
		//Define wait
		FluentWait<RemoteWebDriver> wait=wsobj.defineWait(driver);
		//Launch site
		wsobj.launchSite(driver,"https://semantic-ui.com/modules/dropdown.html");
		//Drop down automation
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(
				                By.xpath("//div[text()='Select Friend']/parent::div")));
		DivDropDownUtilityClass ddu=new DivDropDownUtilityClass();
		//Test case-1: is it multi-select or not?
		if(ddu.isMultiSelect(e))
		{
			System.out.println("Multi-select drop down");
		}
		else
		{
			System.out.println("Single-select drop down");
		}
		//Test case-2: get count of items
		int n=ddu.getItemsCount(e);
		System.out.println(n);
		//Test case-3: get all items and display
		List<String> l=ddu.getItemsNames(driver, e);
		for(String i:l)
		{
			System.out.println(i.trim());
		}
		//Test case-4: select an item
		ddu.selectItemByIndex(e, 5); //zero based index
		Thread.sleep(5000);
		ddu.selectItemByName(e,"Matt");
		Thread.sleep(5000);
		//close site
		//wsobj.closeSite(driver);
	}
}





