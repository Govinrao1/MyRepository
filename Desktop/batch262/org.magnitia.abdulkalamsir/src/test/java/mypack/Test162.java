package mypack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Test162
{
	public static void main(String[] args) throws Exception
	{
		//Multi-select drop down developed using <div> tag
		//Open browser
		WebSiteUtility wsobj=new WebSiteUtility();
		RemoteWebDriver driver=wsobj.openBrowser("chrome");
		//Define wait
		FluentWait<RemoteWebDriver> wait=wsobj.defineWait(driver);
		//Launch site
		wsobj.launchSite(driver,"https://semantic-ui.com/modules/dropdown.html");
		//Locate Multi-select drop down developed using <div> tag
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@id='multiple-selection']/following-sibling::div")));
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
		Thread.sleep(5000);
		//Test case-4: select multiple items
		String x[]= {"HTML","CSS", "Ruby", "Python", "React"};
		ddu.selectItemsByNames(e, x);
		Thread.sleep(5000);
		List<String> ax=ddu.getAllSelectedItems(e);
		List<String> ex=Arrays.asList(x);
		//compare both lists
		if(ddu.compareTwoLists(ex, ax))
		{
			System.out.println("Selection test passed");
		}
		else
		{
			System.out.println("Selection test failed");
		}
		//Test case-5: deselect multiple items
		String y[]= {"CSS", "Python", "React"};
		ddu.deselectItemsByNames(e, y);
		//close site
		//wsobj.closeSite(driver);
	}
}





