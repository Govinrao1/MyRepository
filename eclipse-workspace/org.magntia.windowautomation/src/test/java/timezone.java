import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v96.network.Network;
import org.openqa.selenium.devtools.v96.network.model.ConnectionType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import io.github.bonigarcia.wdm.WebDriverManager;

public class timezone {
	public static void main(String[] args) throws InterruptedException
	{
		//open browser in headless mode
				ChromeOptions o=new ChromeOptions();
			    o.addArguments("--headless"); //native command as argument
			    WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver(o);
				Thread.sleep(5000);
				driver.get("http://www.google.co.in");
				Thread.sleep(5000);
				String x=driver.getTitle();
				System.out.println(x);
				driver.close();
	}
}
