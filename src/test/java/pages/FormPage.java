package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage extends BasePage{

	public FormPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath="//h5[text()='Forms']")
	private WebElement formHeader;

	@FindBy(xpath="//div[text()='Forms']")
	private WebElement formSection;

	@FindBy(xpath="//span[text()='Practice Form']")
	private WebElement practiceForm_section;	

	@FindBy(xpath="//h1[text()='Practice Form']")
	private WebElement practiceForm_header;

	@FindBy(xpath="//input[@id='firstName']")
	private WebElement firstName;

	@FindBy(xpath="//input[@id='lastName']")
	private WebElement lastName;

	@FindBy(xpath="//input[@id='userEmail']")
	private WebElement email;

	//	@FindBy(xpath="//input[@value='Male']")
	@FindBy(xpath="//label[text()='Male']")	
	private WebElement male_radio;

	@FindBy(xpath="//input[@value='Female']")
	private WebElement female_radio;

	@FindBy(xpath="//input[@value='Other']")
	private WebElement other_radio;

	@FindBy(xpath = "//div/input[@placeholder='Mobile Number']")
	private WebElement mobileNumber_input;

	@FindBy(xpath="//input[@id='dateOfBirthInput']")
	private WebElement dateOfBirth_input;

	@FindBy(xpath ="//input[@id='subjectsInput']")
	private WebElement subjectsFeild;

	@FindBy(xpath = "//label[text()='Sports']")
	private WebElement hobbies_sports;

	@FindBy(xpath = "//label[text()='Reading']")
	private WebElement hobbies_Reading;

	@FindBy(xpath = "//label[text()='Music']")
	private WebElement hobbies_Music;



	//--------------------- Form page methods -----------------
	public void launch_Form_URL() throws TimeoutException {
		driver.get("https://demoqa.com");
//		driver.findElement(RelativeLocator.)


		waitTillElementDisplayed(formHeader);  // Implemented Explicit wait using WebDriver Wait
	}

	public void selectFormMainSection() {
		scrollToElement(formHeader); // Base page method which is using JavascriptExecutor
		//		formHeader.click();
		clickOnElement(formHeader); // Base page method which is using JavascriptExecutor
	}

	public void verifyPageURL(String expectedURL) {
		System.out.println(driver.getCurrentUrl());
		assertEquals(expectedURL, driver.getCurrentUrl().trim());
	}

	public void selectFormSection() {
		formSection.click();		
	}

	public void verifyPracticeFormSection() {
		assertTrue(practiceForm_section.isDisplayed());
	}

	public void selectPracticeForm() {
		practiceForm_section.click();
	}

	public void verifyFormDisplay() {
		assertTrue(practiceForm_header.isDisplayed());
	}

	public void enterFirstName(String firstNameValue) {
		firstName.sendKeys(firstNameValue);
	}

	public void enterLastName(String lastNameValue) {
		lastName.sendKeys(lastNameValue);
	}

	public void enterEmail(String emailValue) {
		email.sendKeys(emailValue);	
	}

	public void verifyRadioButtons_Displayed() throws Exception {
		waitTillElementDisplayed(male_radio);
		scrollToElement(male_radio);
		//		assertTrue(male_radio.isDisplayed() && female_radio.isDisplayed() && other_radio.isDisplayed());
	}

	public void selectGender(String Gender) throws TimeoutException {
		waitTillElementDisplayed(male_radio);
		scrollToElement(male_radio);

		switch (Gender) {

		case "Male":
			male_radio.click();
			break;

		case "Female":
			female_radio.click();
			break;

		case "others":
			other_radio.click();
			break;
		}
	}

	public void enterMobileNumber(String mobileNumber) {
		mobileNumber_input.clear();
		mobileNumber_input.sendKeys(mobileNumber);
	}

	public void enterSubjects(String subjects) throws InterruptedException {

		subjectsFeild.click();
		String subArr[]= subjects.split(",");
		for(int i=0; i<=subArr.length-1; i++) {

			for(int j=0; j<=subArr[i].length()-1;j++) {
				System.out.println(subArr[i].charAt(j));
				char c=subArr[i].charAt(j);
				String s = new StringBuilder().append(c).toString();
				subjectsFeild.sendKeys(s);
				Thread.sleep(400);
			}
			subjectsFeild.sendKeys(Keys.TAB);
			System.out.println("Entred one subject");
		}
	}

	public void selectHobbies(String hobbies) {
		
		String hobbeisArr[]=hobbies.split(",");
		
		for(int i=0; i<=hobbeisArr.length-1; i++) {
			System.out.println("insdie hobbeisArr loop");
			
				hobbies_sports.click();
			}
			
		}

	
	
	
	


}


