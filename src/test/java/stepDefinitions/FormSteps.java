package stepDefinitions;

import java.util.concurrent.TimeoutException;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.WebDriverManager;
import pages.FormPage;
import utilities.Excel;

public class FormSteps extends WebDriverManager{

	public TestContext testContext;
	FormPage formPage;
	String path= present_path+EXCEL_PATH;
	
	public FormSteps() {
		testContext = new TestContext();
		formPage= testContext.getWebPageObjectManager().getFormPage();
	}

	@Given("user navigates to the Home page URL")
	public void user_navigates_to_the_home_page_url() throws TimeoutException {
		formPage.launch_Form_URL();
	}

	@When("user selects the FORMS section")
	public void user_selects_the_forms_section() {
		formPage.selectFormMainSection();
	}

	@Then("verify the FORM page is displayed")
	public void verify_the_form_page_is_displayed() {
		formPage.verifyPageURL("https://demoqa.com/forms");
	}

	@Then("click on Forms section")
	public void click_on_forms_section() {
		formPage.selectFormSection();

	}

	@Then("verify the Practice Form section is displayed")
	public void verify_the_practice_form_section_is_displayed() {
		formPage.verifyPracticeFormSection();
	}

	@Then("click on Practice Form section")
	public void click_on_practice_form_section() {
		formPage.selectPracticeForm();
	}

	@Then("verify the FORM is displayed")
	public void verify_the_form_is_displayed() {
		formPage.verifyFormDisplay();
	}

	@When("Form Page is displayed")
	public void form_page_is_displayed() {
		formPage.verifyFormDisplay();
	}

	@Then("enter the First Name: {string}")
	public void enter_the_first_name(String firstName) {
		formPage.enterFirstName(firstName);
	}

	@Then("enter the Last Name: {string}")
	public void enter_the_last_name(String lastName) {
		formPage.enterLastName(lastName);
	}

	@Then("enter the Email address:	{string}")
	public void enter_the_email_address(String email) {
		formPage.enterEmail(email);
	}

	@When("Geneder Radio buttons are displayed and enabled")
	public void geneder_radio_buttons_are_displayed_and_enabled() throws Exception{
		formPage.verifyRadioButtons_Displayed();		
	}

	@Then("select the required Gender")
	public void select_the_required_gender() throws TimeoutException {
		
		String gender = Excel.getValue(path,"FormData", 1, 1);		
		System.out.println("Selected Gender is :"+gender);	
		
		formPage.selectGender(gender);
	}

	@Then("enter the Mobile number")
	public void enter_the_mobile_number() {
		String mobileNumber= Excel.getValue(path, "FormData", 2, 1);
		System.out.println("mobileNumber :"+mobileNumber);
		formPage.enterMobileNumber(mobileNumber);
	}

	@Then("enter the Date of Birth")
	public void enter_the_date_of_birth() {

	}

	@Then("enter the Subjects")
	public void enter_the_subjects() throws InterruptedException {
		String subjects= Excel.getValue(path, "FormData", 4, 1);
		System.out.println("subjects :"+subjects);
		formPage.enterSubjects(subjects);
	}

	@Then("verify the Hobbies checkboxes are displayed and enabled")
	public void verify_the_hobbies_checkboxes_are_displayed_and_enabled() {
		String hobbies= Excel.getValue(path, "FormData", 5, 1);
		formPage.selectHobbies(hobbies);

	}

	@Then("select the required Hobbies")
	public void select_the_required_hobbies() {

	}

}
