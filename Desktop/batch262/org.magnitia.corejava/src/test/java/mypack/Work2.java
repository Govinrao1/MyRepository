package mypack;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Work2 extends Thread
{
	public void run() //method name should be run()
	{
		System.out.println("thread2 is running..."); 
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}
}









