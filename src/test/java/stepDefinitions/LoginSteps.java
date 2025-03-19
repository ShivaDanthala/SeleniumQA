package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.WebDriverManager;
import pages.LoginPage;

public class LoginSteps extends WebDriverManager{

	public TestContext testContext;
	//	public String launch_URL;
	LoginPage loginPage;

	public LoginSteps() {
		testContext = new TestContext();
		loginPage=testContext.getWebPageObjectManager().getLoginPage();
	}


	@Given("user navigates to the website")
	public void user_navigates_to_the_website() throws InterruptedException {
		System.out.println("Launching......");
		loginPage.launchURL();
		System.out.println("URL launched!");

	}

	@When("verify the title of login page")
	public void verify_the_title_of_login_page() {
		loginPage.verifyTitle("DEMOQA");

	}

	@Then("user enters Username")
	public void user_enters_username(){
		loginPage.setUserName("Shiva");
	}

	@Then("user enters Password")
	public void user_enters_password() {
		loginPage.setPassword("shiva@123");
	}

	@Then("click on Login button")
	public void click_on_login_button() {
		loginPage.clickSubmit();

	}

	@Then("verify successful login page")
	public void verify_successful_login_page() {
		loginPage.verifyLogin();
		System.out.println("Home page");
	}

	
	@When("user loggedin successfully")
	public void user_loggedin_successfully() {
		loginPage.verifyLogin();
	}

	@Then("verify the user details")
	public void verify_the_user_details() {
//	    loginPage.verifyUser("Shiva");
		System.out.println("------------verify user details need more validation-----------");
	}

	@Then("verify the logout button")
	public void verify_the_logout_button() {
	    loginPage.verifyLogoutButton();
	}

	@Then("click on logout button")
	public void click_on_logout_button() {
		loginPage.click_Logout();
	}

	@Then("verify the succesful logout")
	public void verify_the_succesful_logout() {
	    loginPage.verifySucessfulLogout();
	}


}
