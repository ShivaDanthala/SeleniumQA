package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import managers.WebDriverManager;
import pages.AllElementsPage;
import utilities.Excel;

public class AllElementsSteps extends WebDriverManager{

	public TestContext testContext;
	AllElementsPage allElementsPage;
//	String path= present_path+EXCEL_PATH;
	String path ="C:\\SeleniumQA\\src\\test\\resources\\configurations\\TestData.xlsx";
	
	public AllElementsSteps() {
		testContext = new TestContext();
		allElementsPage = testContext.getWebPageObjectManager().getAllElementPage();
	}
	
	@Given("User is navigated application URL")
	public void user_is_navigated_application_url() {
	   String appURL=Excel.getValue(path, "AllElements", 1, 1);
	   System.out.println("appURL is :" +appURL);
	   allElementsPage.launchAppURL(appURL);
	}

}
