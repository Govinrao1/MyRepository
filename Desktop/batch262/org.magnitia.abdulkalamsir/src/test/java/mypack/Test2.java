package mypack;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2
{
	public static void main(String[] args)
	{
		//download latest gecko driver software
		WebDriverManager.firefoxdriver().setup();
		//Open firefox browser using that gecko driver software
		FirefoxDriver driver=new FirefoxDriver();
	}

}
