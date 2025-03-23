package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"C:\\Workspaces\\SeleniumQA\\src\\test\\resources\\features\\fillForm.feature"},
		glue= {"stepDefinitions"},
//		tags= {"@test"}, 
		plugin = { "pretty","html:target/cucumber-reports/report.html"},
		monochrome=true	
				
		
		)
public class TestRunner{
	
}

//public class TestRunner extends AbstractTestNGCucumberTests{
//	
//	public void writeToEnvironment() {
//		String browser = FileReaderManager.getInstance().getConfigFileReader().getBrowser();
//		System.out.println(browser);
//		FileReaderManager.getInstance().getConfigFileReader().writeConfigFile(browser);
//	}
//}
