package mypack;

import org.openqa.grid.selenium.GridLauncherV3;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterOpera
{
	public static void main(String[] args)
	{
		WebDriverManager.operadriver().setup();
		String x[]=new String[] { "-role", "node", 
				                  "-hub", "http://192.168.0.101:4444/grid/register", 
				                  "-browser", "browserName=operablink", 
				                  "-port", "5558" };
        GridLauncherV3.main(x);
	}
}
