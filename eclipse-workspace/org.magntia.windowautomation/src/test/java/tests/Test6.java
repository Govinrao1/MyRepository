package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6
{
	public static void main(String[] args) throws Exception
	{
		//Open browser and launch site(SWD)
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com");
		//Automate notifications pop-up window(SikuliX)
		Screen s=new Screen();
		if(s.exists("src\\test\\resources\\images\\block.png",5000)!=null)
		{
			s.click("src\\test\\resources\\images\\block.png");
			//if window still exist without closing
			while(true)
			{
				try
				{
					s.click("src\\test\\resources\\images\\block.png");
				}
				catch(Exception ex)
				{
					System.out.println("Pop-up is already closed");
					break; //terminate from infinite loop
				}
			}
		}
		//Close site(SWD)
		driver.close();
	}
}
