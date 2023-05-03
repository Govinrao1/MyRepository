package mypack;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 
{
	@Test
	@Parameters({"url","bn"})
	public void method(String x,String y) throws Exception
	{
		URL u=new URL(x); 
		DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability("browserName",y);
		RemoteWebDriver driver=new RemoteWebDriver(u,dc);
		driver.get("http://www.google.co.in");
		if(driver.getTitle().equals("Google"))
		{
			System.out.println("Test passed in "+x);
		}
		else
		{
			
			System.out.println("Test failed in "+x);
		}
		driver.close();
	}
}
