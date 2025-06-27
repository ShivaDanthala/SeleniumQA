package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import enums.EnvironmentType;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import managers.FileReaderManager;
import utils.Utils;

public class Hooks {

	private static EnvironmentType environmentType;
	WebDriver driver = new TestContext().webDriverManager.createLocalDriver();


	/* public Hooks(TestContext context) { testContext =context; } */


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
				Utils.takeScreenshot(scenario.getName(), driver);
			}

			//driver.quit();
			break;

		case MOBILE:
			if(status.equalsIgnoreCase("Failed")) {
				//Utils.takeScreenshot(scenario.getName(), testContext.webDriverManager.createLocalDriverMobile());
			}
			break;
		}


	}
}
