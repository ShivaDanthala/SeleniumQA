package stepDefinitions;

import java.util.concurrent.TimeoutException;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.WebDriverManager;
import pages.WaitConditionsPage;
import utilities.Excel;

public class WaitConditionsSteps extends WebDriverManager{

	public TestContext testContext;
	WaitConditionsPage waitConditionsPage;
	//	String path= present_path+EXCEL_PATH;
	String path ="C:\\SeleniumQA\\src\\test\\resources\\configurations\\TestData.xlsx";

	public WaitConditionsSteps() {
		testContext = new TestContext();
		waitConditionsPage = testContext.getWebPageObjectManager().getWaitConditionsPage();
	}

	@Then("close the browser")
	public void close_the_browser() {
		waitConditionsPage.closeBrowser();
	}

	/**
	 * The Playground steps
	 * **/

	@Given("User is navigated application The Playground URL")
	public void user_is_navigated_application_the_playground_url() {
		String appURL=Excel.getValue(path, "PlayGround", 1, 1);
		waitConditionsPage.launchAppURL(appURL);
	}
	@When("click on Wait Conditions View Page button")
	public void click_on_wait_conditions_view_page_button() {
		waitConditionsPage.clickOnViewPage();
	}

	@Then("verify the Wait for Alert To Be Present Header is displayed")
	public void verify_the_wait_for_alert_to_be_present_header_is_displayed() throws Exception {
		waitConditionsPage.verifyWaitForAlert_Header();
	}

	@Then("verify the Show Alert button is displayed")
	public void verify_the_show_alert_button_is_displayed() throws Exception {
		waitConditionsPage.verfiyButtonDisplayed();
	}
	@Then("click on Show Alert button")
	public void click_on_show_alert_button() {
		waitConditionsPage.clickOnShowAlert();
	}

	@Then("verify Alert and Accept")
	public void verify_alert_and_accept() throws TimeoutException {
		waitConditionsPage.acceptAlert();
	}

	@Then("verify Alert handled successfully")
	public void verify_alert_handled_successfully() {
		waitConditionsPage.alertSuccessfull();
	}

	@Then("verify the Show Prompt button is displayed")
	public void verify_the_show_prompt_button_is_displayed() {
		waitConditionsPage.verfiyPromptButtonDisplayed();
	}

	@Then("click on Show Prompt button")
	public void click_on_show_prompt_button() {
		waitConditionsPage.clickOnShowPrompt();
	}

	@Then("verify AlertPrompt handled successfully")
	public void verify_alert_prompt_handled_successfully() throws TimeoutException {
		waitConditionsPage.alertPromptSuccessfull();
	}

	@Then("verify the Wait for Element To Be Visible Header is displayed")
	public void verify_the_wait_for_element_to_be_visible_header_is_displayed() throws Exception {
		waitConditionsPage.verifyWaitForElement_Header();
	}
	@Then("Click on TRIGGER button in Element To Be Visible Header section")
	public void click_on_trigger_button_in_element_to_be_visible_header_section() {
		waitConditionsPage.clickOnTriggerButtonVisibleSection();
	}
	@Then("Wait for visibilty of CLICK ME button")
	public void wait_for_visibilty_of_click_me_button() throws TimeoutException {
		waitConditionsPage.verifyTheClickMeButton();
	}
	@Then("click on CLICK ME button")
	public void click_on_click_me_button() {
		waitConditionsPage.clickOnClickMeButton();
	}

	@Then("verify the Displayed Options")
	public void verify_the_displayed_options() throws TimeoutException {
		waitConditionsPage.verifyTheDisplayedOptions();
	}

	@Then("verify the Wait for Element To Be Invisible Header is displayed")
	public void verify_the_wait_for_element_to_be_invisible_header_is_displayed() {
		waitConditionsPage.verifyWaitForElementInvisible_Header();
	}
	@Then("Click on TRIGGER button in Element To Be Invisible Header section")
	public void click_on_trigger_button_in_element_to_be_invisible_header_section() {
		waitConditionsPage.clickOnTriggerButton_InvisibleSection();
	}
	@Then("Wait for Invisibilty of spinner")
	public void wait_for_invisibilty_of_spinner() {
		waitConditionsPage.verifyTheInvisibility_Spinner();
	}
	@Then("verify the text Thank God that spinner is gone!")
	public void verify_the_text_thank_god_that_spinner_is_gone() throws TimeoutException {
		waitConditionsPage.verifySpinnerGone();
	}





}
