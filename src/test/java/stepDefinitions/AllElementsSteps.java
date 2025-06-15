package stepDefinitions;

import java.util.concurrent.TimeoutException;

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

	@Then("close the browser")
	public void close_the_browser() {
		allElementsPage.closeBrowser();
	}

	/**
	 * The Playground steps
	 * **/

	@Given("User is navigated application The Playground URL")
	public void user_is_navigated_application_the_playground_url() {
		String appURL=Excel.getValue(path, "PlayGround", 1, 1);
		allElementsPage.launchAppURL(appURL);
	}
	@When("click on Wait Conditions View Page button")
	public void click_on_wait_conditions_view_page_button() {
		allElementsPage.clickOnViewPage();
	}

	//	@Then("verify the Wait for element to be visible Header is displayed")
	//	public void verify_the_wait_for_element_to_be_visible_header_is_displayed() throws Exception {
	//	   allElementsPage.verifyWaitForElement_Header();
	//	}

	@Then("verify the Wait for Alert To Be Present Header is displayed")
	public void verify_the_wait_for_alert_to_be_present_header_is_displayed() throws Exception {
		allElementsPage.verifyWaitForAlert_Header();
	}

	@Then("verify the Show Alert button is displayed")
	public void verify_the_show_alert_button_is_displayed() throws Exception {
		allElementsPage.verfiyButtonDisplayed();
	}
	@Then("click on Show Alert button")
	public void click_on_show_alert_button() {
		allElementsPage.clickOnShowAlert();
	}

	@Then("verify Alert and Accept")
	public void verify_alert_and_accept() throws TimeoutException {
		allElementsPage.acceptAlert();
	}

	@Then("verify Alert handled successfully")
	public void verify_alert_handled_successfully() {
		allElementsPage.alertSuccessfull();
	}

	@Then("verify the Show Prompt button is displayed")
	public void verify_the_show_prompt_button_is_displayed() {
		allElementsPage.verfiyPromptButtonDisplayed();
	}

	@Then("click on Show Prompt button")
	public void click_on_show_prompt_button() {
		allElementsPage.clickOnShowPrompt();
	}

	@Then("verify AlertPrompt handled successfully")
	public void verify_alert_prompt_handled_successfully() throws TimeoutException {
		allElementsPage.alertPromptSuccessfull();
	}

	@Then("verify the Wait for Element To Be Visible Header is displayed")
	public void verify_the_wait_for_element_to_be_visible_header_is_displayed() throws Exception {
		allElementsPage.verifyWaitForElement_Header();
	}
	@Then("Click on TRIGGER button in Element To Be Visible Header section")
	public void click_on_trigger_button_in_element_to_be_visible_header_section() {
		allElementsPage.clickOnTriggerButtonVisibleSection();
	}
	@Then("Wait for visibilty of CLICK ME button")
	public void wait_for_visibilty_of_click_me_button() throws TimeoutException {
		allElementsPage.verifyTheClickMeButton();
	}
	@Then("click on CLICK ME button")
	public void click_on_click_me_button() {
		allElementsPage.clickOnClickMeButton();
	}

	@Then("verify the Displayed Options")
	public void verify_the_displayed_options() throws TimeoutException {
		allElementsPage.verifyTheDisplayedOptions();
	}

	@Then("verify the Wait for Element To Be Invisible Header is displayed")
	public void verify_the_wait_for_element_to_be_invisible_header_is_displayed() {
		allElementsPage.verifyWaitForElementInvisible_Header();
	}
	@Then("Click on TRIGGER button in Element To Be Invisible Header section")
	public void click_on_trigger_button_in_element_to_be_invisible_header_section() {
		allElementsPage.clickOnTriggerButton_InvisibleSection();
	}
	@Then("Wait for Invisibilty of spinner")
	public void wait_for_invisibilty_of_spinner() {
		allElementsPage.verifyTheInvisibility_Spinner();
	}
	@Then("verify the text Thank God that spinner is gone!")
	public void verify_the_text_thank_god_that_spinner_is_gone() throws TimeoutException {
		allElementsPage.verifySpinnerGone();
	}





}
