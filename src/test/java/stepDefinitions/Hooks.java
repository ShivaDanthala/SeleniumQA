package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import io.cucumber.java.Scenario;
import managers.WebDriverManager;

public class Hooks {

	WebDriver driver;
	WebDriverManager webDriverManager;
	TestContext testContext;
	//	private static EnvironmentType environmentType;


//	public Hooks(TestContext context) {
//		testContext = context;
//		testContext = new TestContext();
//		System.out.println("Inside Hooks");
//	}

//	@Before
    public void setUp() {
        System.out.println("Into the setup method of AccountStep...");
        driver = webDriverManager.createLocalDriver();
    }
	
	
//	@After
	public void endTest(Scenario scenario) {
		System.out.println("Scenario is  ------> "+scenario.getName());
		System.out.println("Scenario status ------> "+scenario.getStatus());
		System.out.println("Scenario getClass ------> "+scenario.getClass());
		
//		System.out.println("Cleaning activity..");
		driver.quit();
		
	}
}
