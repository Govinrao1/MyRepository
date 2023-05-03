package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;

import com.google.common.collect.ImmutableMap;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test199 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Create DevTools session
		DevTools dt=driver.getDevTools();
		dt.createSession();
		//Change page view in required device model(as per given user agent)
		Command cmd1=new Command("Emulation.setUserAgentOverride",ImmutableMap.of("userAgent",
                "Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 "
                +"(KHTML, like Gecko) Version/11.0 Mobile/15A372 Safari/604.1"));
		Command cmd2=new Command("Emulation.setDeviceMetricsOverride",ImmutableMap.of(
				"width",375,"height",812,"deviceScaleFactor",3,"mobile",true,"scale",1));
		//true for mobile based and false for computer based
		dt.send(cmd1);
        dt.send(cmd2);
        //Launch site
		driver.get("https://www.magnitia.com");
		Thread.sleep(20000);
		
	}
}
