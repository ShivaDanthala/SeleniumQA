package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features= {"C:\\SeleniumQA\\src\\test\\resources\\features\\PlayGround_Wait.feature"},
		glue= {"stepDefinitions"},
		//tags= {"@waitConditions"},
		plugin = {"pretty", "html:target/cucumber-reports/cucumber.html","json:target/cucumber.json"},
		monochrome=true
		)

public class TestRunner{

}

/**
public class TestRunner extends AbstractTestNGCucumberTests{
	
	public void writeToEnvironment() {
		String browser = FileReaderManager.getInstance().getConfigFileReader().getBrowser();
		System.out.println(browser);
		FileReaderManager.getInstance().getConfigFileReader().writeConfigFile(browser);
	}
}
**/