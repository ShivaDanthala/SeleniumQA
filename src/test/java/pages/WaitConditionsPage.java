package pages;

import static org.testng.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WaitConditionsPage extends BasePage {

	public WaitConditionsPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath="//h5[normalize-space()='Keyboard Actions']/preceding::a[@class='btn btn-success']")
	private WebElement viewPage1;

	@FindBy(xpath="//h3[normalize-space()='Wait for alert to be present']")
	private WebElement headerWaitForAlert;

	@FindBy(xpath="//button[text()='Show Alert']")
	private WebElement btnShowAlert;

	@FindBy(xpath="//span[normalize-space()='Alert handled']")
	private WebElement msgAlertHandled;

	@FindBy(xpath="//button[text()='Show Prompt']")
	private WebElement btnShowPrompt;
	
	@FindBy(xpath="//span[@id='confirm_cancelled_badge']")
	private WebElement cancelMsg_ShowPrompt;
	
	@FindBy(xpath="//span[@id='confirm_ok_badge']")
	private WebElement oKMsg_ShowPrompt;
		
	@FindBy(xpath="//h3[text()='Wait for element to be visible']")
	private WebElement headerWaitForElementVisible;
	
	@FindBy(xpath="//h3[text()='Wait for element to be Invisible']/preceding::button[text()='Trigger']")
	private WebElement btnTrigger_WaitForElementVisible;
	
	@FindBy(xpath="//h3[text()='Wait for element to be Invisible']/preceding::button[text()='Click Me']")
	private WebElement btnClickMe_WaitForElementVisibleSection;
	
	@FindBy(xpath="//h3[text()='Can you see me?']")
	private WebElement msgCanYouSeeMe;
	
	@FindBy(xpath="//div[text()='I just removed my invisibility cloak!!']")
	private WebElement div_IJustRemovedMyInvisibilityCloak;
	
	@FindBy(xpath="//h3[text()='Wait for element to be Invisible']")
	private WebElement headerWaitForElementInvisible;
	
	@FindBy(xpath="//div[@id='invisibility_target']/preceding::button[text()='Trigger'][1]")
	private WebElement btnTrigger_WaitForElementIvisible;
	
	@FindBy(xpath="//div[@id='invisibility_target']")
	private WebElement spanLoadingSpinner;
	
	@FindBy(xpath="//p[@id='spinner_gone']")
	private WebElement msgSpinnerGone;
	
	@FindBy(xpath="//h3[contains(text(),'element to be enabled')]")
	private WebElement headerElementToBeEnabled;
	
	@FindBy(xpath="//button[normalize-space()='Disabled Button']/preceding::button[text()='Trigger'][1]")
	private WebElement btnTrigger_ElementToBbeEnabled;
	
	@FindBy(xpath="//button[normalize-space()='Disabled Button']")
	private WebElement btnDisabled;
	
	@FindBy(xpath="//button[normalize-space()='Enabled Button']")
	private WebElement btnEnabled;
	
	@FindBy(xpath="//h3[text()='Yay! I am super active now!']")
	private WebElement msgIamSuperActiveNow;
	
	@FindBy(xpath="//div[text()='See, you just clicked me!!']")
	private WebElement div_SeeYouJustClickedMe;
	
	
	
	
	
	

	/*************** Test Methods **************/


	public void clickOnViewPage() {
		viewPage1.click();		
	}

	public void verifyheader_WaitForAlert() throws Exception {
		assertTrue(headerWaitForAlert.isDisplayed(), "headerWaitForAlert is NOT displayed");
	}
	
	public void verfiyButtonDisplayed() throws Exception {
		assertTrue(btnShowAlert.isDisplayed(), "showAlert button is NOT displayed");
	}

	public void clickOnShowAlert() {
		btnShowAlert.click();
	}

	public void acceptAlert() throws TimeoutException {
		waitTillAlertDisplayed();
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}

	public void alertSuccessfull() {
		assertTrue(msgAlertHandled.isDisplayed());
		System.out.println("Assert PASSED");
	}

	public void verfiyPromptButtonDisplayed() {
			assertTrue(btnShowPrompt.isDisplayed(), "Show Prompt btn is NOT displayed");
	}

	public void clickOnShowPrompt() {
		btnShowPrompt.click();		
	}

	public void alertPromptSuccessfull() throws TimeoutException {
		waitTillAlertDisplayed();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		//First Cancel or Dismiss
		alert.dismiss();		
		assertTrue(cancelMsg_ShowPrompt.isDisplayed(), "No Cancel Prompt message is showing");
		
		// Now accepting or OK
		btnShowPrompt.click();
		waitTillAlertDisplayed();
		alert.accept();
		assertTrue(oKMsg_ShowPrompt.isDisplayed(), "No OK Prompt message is showing");
	}

	public void verifyWaitForElement_Header() throws Exception {
		assertTrue(headerWaitForElementVisible.isDisplayed(), "headerWaitForElementVisible is NOT displayed");
		scrollToElement(headerWaitForElementVisible);
	}

	public void clickOnTriggerButtonVisibleSection() {
		btnTrigger_WaitForElementVisible.click();		
	}

	public void verifyTheClickMeButton() throws TimeoutException {
		waitTillButtonDisplayed(btnClickMe_WaitForElementVisibleSection);
	}

	public void clickOnClickMeButton() {
		btnClickMe_WaitForElementVisibleSection.click();
	}

	public void verifyTheDisplayedOptions() throws TimeoutException {
		
		List<WebElement> allOptions = new ArrayList<WebElement>();
		
		allOptions.add(msgCanYouSeeMe);
		allOptions.add(div_IJustRemovedMyInvisibilityCloak);
		
		waitTillAllElementsDisplayed(allOptions);
		
	}

	public void verifyheader_WaitForElementInvisible() {
		assertTrue(headerWaitForElementInvisible.isDisplayed(), "headerWaitForElementInvisible NOT loaded");
		scrollToElement(headerWaitForElementInvisible);
	}

	public void clickOnTriggerButton_InvisibleSection() {
		btnTrigger_WaitForElementIvisible.click();
	}

	public void verifyTheInvisibility_Spinner() {
		waitTillElementisInvisible(spanLoadingSpinner);
	}

	public void verifySpinnerGone() throws TimeoutException {
		waitTillElementDisplayed(msgSpinnerGone);		
	}

	public void verifyheader_ElementToBeEnabledSection() {
		assertTrue(headerElementToBeEnabled.isDisplayed(), "headerElementToBeEnabled is NOT displayed");
		scrollToElement(headerElementToBeEnabled);
	}

	public void verifyButton_Disabled() {
		assertTrue(btnDisabled.isDisplayed(), "btnDisabled NOT displayed");
	}

	public void clickOnTriggerButton_ElememtToBeEnabledSection() {
		 btnTrigger_ElementToBbeEnabled.click();
	}

	public void verifyDisablity_DisabledBtn() {
		assertTrue(!btnDisabled.isDisplayed(), "btnDisabled is displayed");
		waitTillElementisInvisible(btnDisabled);
	}

	public void verifyEnabledBtn() throws TimeoutException {
		waitTillElementDisplayed(btnEnabled);
		assertTrue(btnEnabled.isDisplayed(), "btnEnabled is NOT displayed");
	}

	public void click_EnabledBtn() {
		isEquals(btnEnabled.getText(), "Enabled Button");
		btnEnabled.click();	
		
	}

public void verifyTheDisplayedOptions_EnbaledButton() throws TimeoutException {
		
		List<WebElement> allOptions = new ArrayList<WebElement>();
		
		allOptions.add(msgIamSuperActiveNow);
		allOptions.add(div_SeeYouJustClickedMe);
		
		waitTillAllElementsDisplayed(allOptions);
		
	}










}
