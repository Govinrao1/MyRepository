package gluecode;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefs
{
	public RemoteWebDriver driver;
	public FluentWait<RemoteWebDriver> wait;
	public Scenario s;
	public SoftAssert sa;
	
	@Before
	public void method(Scenario x)
	{
		s=x;
		sa=new SoftAssert();
	}
	
	@Given("open chrome browser")
	public void open_chrome_browser() throws Exception
	{
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    wait=new FluentWait<RemoteWebDriver>(driver);
	    wait.pollingEvery(Duration.ofMillis(500));
	    wait.withTimeout(Duration.ofSeconds(20));
	}

	@When("launch site {string}")
	public void launch_site(String url) 
	{
	    driver.get(url);
	    driver.manage().window().maximize();
	}

	@Then("title should be contains {string}")
	public void title_should_be(String ext) 
	{
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
	    String act=driver.getTitle();
	    if(act.contains(ext))
	    {
	    	s.log("Title test passed");
	    	sa.assertTrue(true);
	    }
	    else
	    {
	    	s.log("Expected title is: "+ext);
	    	s.log("Actual title is: "+act);
	    	s.log("Title test failed");
	    	sa.assertTrue(false,"Title test");
	    }
	}

	@When("close site")
	public void close_site() 
	{
	    driver.quit();
	}
	
	@After
	public void lastmethod()
	{
		sa.assertAll();
	}
}
