package stepDefinitions;

import java.io.IOException;

import cucumber.TestContext;
import enums.EnvironmentType;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import managers.FileReaderManager;
import managers.WebDriverManager;
import utils.Utils;

public class Hooks {

	TestContext testContext = new TestContext();
	private static EnvironmentType environmentType;
	WebDriverManager webDriverManager = new WebDriverManager();

	//public Hooks(TestContext context) {	testContext =context }


	//@Before
	public void setUp() {
		System.out.println("Into the setup method of AccountStep...");
		//driver = testContext.webDriverManager.createLocalDriver();
	}


	@After
	public void endTest(Scenario scenario) throws IOException {
		
		String status=scenario.getStatus().name();
		System.out.println("status : " +status);

		environmentType=FileReaderManager.getInstance().getConfigFileReader().getEnvironment();

		System.out.println(environmentType);
		
		switch (environmentType) {
		case BROWSER:
			if(status.equalsIgnoreCase("Failed")) {
				Utils.takeScreenshot(scenario.getName(), testContext.webDriverManager.createLocalDriver());
			}
			
			testContext.webDriverManager.closeDriver();
			break;
			
		case MOBILE:
			if(status.equalsIgnoreCase("Failed")) {
				//Utils.takeScreenshot(scenario.getName(), testContext.webDriverManager.createLocalDriverMobile());
			}
			break;
		}


	}
}
