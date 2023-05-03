package mypack;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test1
{
	public static void main(String[] args) throws Exception
	{
		//Give Cloud(Sauce Labs) details
		String un="magnitiabatch251";
		String akey="a7e12fd4-cc8a-4922-9f6c-a81831d8a778";
		String endpoint="http://"+un+":"+akey+"@ondemand.saucelabs.com:80/wd/hub";
		//Desired Capabilities to give required Test environment details
		DesiredCapabilities dc=new DesiredCapabilities();
		//About browser
		dc.setBrowserName("Chrome");
		//About OS
		dc.setCapability("platform",Platform.MAC); //OS
		//Open browser in specified OS
		URL u=new URL(endpoint);
		RemoteWebDriver driver=new RemoteWebDriver(u,dc);
		//Launch site
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		//Validation
		if(driver.getTitle().equals("Google"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		//Search for a word
		driver.findElement(By.name("q")).sendKeys("kalam",Keys.ENTER);
		Thread.sleep(5000);
		//Validation
		if(driver.getTitle().contains("kalam"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		//Close site
		driver.close();
	}
}
