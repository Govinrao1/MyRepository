package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test190
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser and Launch site
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//run javascript code asynchronously(irrespective of order of statements)
		driver.executeAsyncScript(
				 "window.setTimeout(function(){window.alert('hi kalam sir');},1000);"
				  +"window.setTimeout(function(){window.alert('how are you?');},500);"
				  + "window.alert('hi students');");
	}
}








