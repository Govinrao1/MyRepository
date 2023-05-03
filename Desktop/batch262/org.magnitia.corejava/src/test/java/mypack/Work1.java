package mypack;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Work1 extends Thread
{
	public void run() //method name should be run()
	{
		System.out.println("thread1 is running..."); 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
	}
}









