package mypack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Test165
{
	public static void main(String[] args) throws Exception
	{
		//Open browser and launch site
		WebSiteUtility wsobj=new WebSiteUtility();
		RemoteWebDriver driver=wsobj.openBrowser("chrome");
		//Define wait
		FluentWait<RemoteWebDriver> wait=wsobj.defineWait(driver);
		//Launch site
		wsobj.launchSite(driver,"http://www.gmail.com");
		//Fill userid via visual relations
		WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(
				                    By.xpath("//*[text()='to continue to Gmail']")));
		WebElement e2=wait.until(ExpectedConditions.visibilityOfElementLocated(
				                           By.xpath("//*[text()='Forgot email?']")));
		WebElement target=wait.until(ExpectedConditions.visibilityOfElementLocated(
				        RelativeLocator.with(By.tagName("input")).below(e1).above(e2)));
		target.sendKeys("magnitiait");
	}
}
