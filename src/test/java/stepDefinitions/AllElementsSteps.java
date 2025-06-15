package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
		//		System.out.println("appURL is :" +appURL);
		allElementsPage.launchAppURL(appURL);
	}

	@When("click on Add-Remove elements link")
	public void click_on_add_remove_elements_link() {
		allElementsPage.clickAddRemoveLink();
	}

	@Then("verify the Add-Remove elements page is open")
	public void verify_the_add_remove_elements_page_is_open() {
		allElementsPage.verifyAddRemovePage();
	}

	@Then("click on ADD ELEMENT button")
	public void click_on_add_element_button() {
		allElementsPage.clickADDButton();
	}

	@Then("verify DELETE button is displayed")
	public void verify_delete_button_is_displayed() {
		allElementsPage.verifyDELETEButton();
	}

	@Then("click on DELETE button")
	public void click_on_delete_button() {
		allElementsPage.clickDELETEButton();
	}

	@Then("verify for DELETE button is disappeared")
	public void verify_for_delete_button_is_disappeared() {
		allElementsPage.verifyDELETEButton_PostAdd();
	}

//	@Then("close the browser")
//	public void close_the_browser() {
//		allElementsPage.closeBrowser();
//	}

	




}
