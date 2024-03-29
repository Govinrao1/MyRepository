package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src\\test\\resources\\features"},
		glue={"gluecode"},
		monochrome=true,
		plugin={"pretty","html:target/res","rerun:target/failedscenarios.txt"}
		)
public class Runner extends AbstractTestNGCucumberTests
{
	// This class will be empty by default 
}
