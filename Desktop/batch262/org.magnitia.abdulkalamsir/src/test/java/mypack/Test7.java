package mypack;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7 
{
	public static void main(String[] args)
	{
		//get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn=sc.nextLine();
		//declare global object to parent class
		RemoteWebDriver driver=null;
		//open given browser
		if(bn.equals("chrome"))
		{
			//download latest chrome driver software
			WebDriverManager.chromedriver().setup();
			//Open chrome browser using that chrome driver software
			driver=new ChromeDriver(); //child class constructor
		}
		else if(bn.equals("firefox"))
		{
			//download latest gecko driver software
			WebDriverManager.firefoxdriver().setup();
			//Open firefox browser using that gecko driver software
			driver=new FirefoxDriver();//child class constructor
		}
		else if(bn.equals("ie"))
		{
			//download latest iedriverserver software
			WebDriverManager.iedriver().setup();
			//open IE browser using that iedriverserver software
			driver=new InternetExplorerDriver(); //child class constructor
		}
		else if(bn.equals("edge"))
		{
			//download latest msedgedriver software
			WebDriverManager.edgedriver().setup();
			//open edge browser using that msedgedriver software
			driver=new EdgeDriver(); //child class constructor
		}
		else
		{
			System.out.println("Wrong browser name");
			System.exit(0);
		}
		//common code
		driver.get("http://www.facebook.com");
		//driver.quit();

	}

}








