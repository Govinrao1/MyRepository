package mypack;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test202OpenBrowser
{
	public static void main(String[] args)
	{
		//Open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//get browser capabilities in key value pairs
	    Capabilities c=driver.getCapabilities();
	    Map<String,Object> m=c.asMap();
	    m.forEach((key, value) -> 
	    {
	         System.out.println("Key is: " + key + " Value is: " + value);
	    });
	    //don't close browser
	    //copy "localhost:50839" like value in output
	}

}
