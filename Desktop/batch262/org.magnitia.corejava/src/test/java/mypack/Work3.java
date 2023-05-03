package mypack;

import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Work3 extends Thread
{
	public void run() //method name should be run()
	{
		System.out.println("thread3 is running..."); 
		WebDriverManager.operadriver().setup();
		OperaDriver driver=new OperaDriver();
		driver.get("http://www.google.co.in");
	}
}












