package mypack;

import org.openqa.grid.selenium.GridLauncherV3;

public class StartHub
{
	public static void main(String[] args)
	{
		String x[]=new String[]{ "-role", "hub", 
								 "-port", "4444" };
		GridLauncherV3.main(x);
	}
}
