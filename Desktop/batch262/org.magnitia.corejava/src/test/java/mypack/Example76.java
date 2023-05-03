package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example76
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://www.google.co.in");
		WebElement e=driver.findElement(By.name("q"));
		//way-1(Type casting)
		String x=(String) driver.executeScript("return(arguments[0].textContent);",e);
		//way-2(toString() method in "Object" class)
		String y=driver.executeScript("return(arguments[0].textContent);",e).toString();
		//way-3(using "valueOf()" method in String class)
		Object o1=driver.executeScript("return(arguments[0].textContent);",e);
		String z="";
		x=z.valueOf(o1); 
	}
}








