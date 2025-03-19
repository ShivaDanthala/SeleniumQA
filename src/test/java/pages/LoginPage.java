package pages;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@id='userName']")
	private WebElement userNameBox;

	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordBox;

	@FindBy(xpath="//button[@id='login']")
	private WebElement login_btn;

	@FindBy(xpath="//label[text()='User Name : ']")
	private WebElement userName_Label;

	@FindBy(xpath="//label[@id='userName-value']")
	private WebElement userName_LabelValue;

	@FindBy(xpath="//button[text()='Log out']")
	private WebElement logut_btn;

	@FindBy(xpath="//h1[text()='Login']")
	private WebElement login_header;








	public void launchURL() throws InterruptedException {
		driver.get("https://demoqa.com/login");
		Thread.sleep(20);
	}

	public void verifyTitle(String appTitle) {
		if (driver.getTitle().equals(appTitle)) {
			System.out.println("Title is matched");

		}else {
			System.out.println("Title is NOT matched");
		}
	}

	public void setUserName(String userName) {
		if(userNameBox.isDisplayed()){
			System.out.println("Inside username");
			userNameBox.sendKeys(userName);}
		else
		{System.out.println("Element is not visible");}

	}

	public void setPassword(String password) {
		passwordBox.sendKeys(password);
	}

	public void clickSubmit() {
		login_btn.click();
	}

	public void verifyLogin() {
		System.out.println("In assertion");
		//System.out.println(" TExt is " +userName_Label.getText());
		//assertTrue(userName_Label.isDisplayed());
	}

	public void verifyUser(String expected_User) {
		System.out.println(userName_LabelValue.getText());
		assertEquals(userName_LabelValue.getText(), expected_User);
	}

	public void verifyLogoutButton() {
		assertTrue(logut_btn.isDisplayed());
	}

	public void click_Logout() {
		logut_btn.click();
	}

	public void verifySucessfulLogout() {
		assertTrue(login_header.isDisplayed());	
	}



}
