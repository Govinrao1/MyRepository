package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.collect.ImmutableMap;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test193
{
	public static void main(String[] args) throws Exception
	{
		//Open browser and launch SUT(site under testing)
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://www.gmail.com");
		//Create "DevTools" session 
		DevTools dt=((ChromiumDriver) driver1).getDevTools();
		dt.createSession();
		//Crash that browser window via CDP command
		try
		{
			Command c=new Command("Browser.crash",ImmutableMap.of());
			dt.send(c);
		}
		catch(Exception ex)
		{
			System.out.println("continue further testing");
		}
		Thread.sleep(5000);
		//Open new browser and re-launch site for recovery testing
		try
		{
			ChromeDriver driver2=new ChromeDriver();
			driver2.get("http://www.gmail.com");
			System.out.println("Recovery test passed");
			driver2.close();
		}
		catch(Exception ex)
		{
			System.out.println("Recovery test failed due to relaunch failure");
		}
	}
}
