package pages;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllElementsPage extends BasePage {

	public AllElementsPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath="//a[text()='Add/Remove Elements']")
	private WebElement addRemoveElements_link;

	@FindBy(xpath="//h3[text()='Add/Remove Elements']")
	private WebElement addRemoveElements_header;

	@FindBy(xpath="//button[@onclick='addElement()']")
	private WebElement addElement_btn;

	@FindBy(xpath="//button[@onclick='deleteElement()']")
	private WebElement deleteElement_btn;

	//-------------------
	@FindBy(xpath="//h5[normalize-space()='Keyboard Actions']/preceding::a[@class='btn btn-success']")
	private WebElement viewPage1;

	@FindBy(xpath="//h3[normalize-space()='Wait for alert to be present']")
	private WebElement WaitForAlert_header;

	@FindBy(xpath="//button[text()='Show Alert']")
	private WebElement showAlert_btn;

	@FindBy(xpath="//span[normalize-space()='Alert handled']")
	private WebElement alertHandledMsg;

	@FindBy(xpath="//button[text()='Show Prompt']")
	private WebElement showPrompt_btn;
	
	@FindBy(xpath="//span[@id='confirm_cancelled_badge']")
	private WebElement showPrompt_CancelMsg;
	
	@FindBy(xpath="//span[@id='confirm_ok_badge']")
	private WebElement showPrompt_OKMsg;
		
	@FindBy(xpath="//h3[text()='Wait for element to be visible']")
	private WebElement WaitForElementVisible_header;
	
	@FindBy(xpath="//h3[text()='Wait for element to be Invisible']/preceding::button[text()='Trigger']")
	private WebElement WaitForElementVisibleTrigger_btn;
	
	@FindBy(xpath="//h3[text()='Wait for element to be Invisible']/preceding::button[text()='Click Me']")
	private WebElement WaitForElementVisibleClickMe_btn;
	
	@FindBy(xpath="//h3[text()='Can you see me?']")
	private WebElement canYouSeeMe;
	
	@FindBy(xpath="//div[text()='I just removed my invisibility cloak!!']")
	private WebElement iJustRemovedMyInvisibilityCloak;
	
	
	
	@FindBy(xpath="//h3[text()='Wait for element to be Invisible']")
	private WebElement WaitForElementInvisible_header;
	
	@FindBy(xpath="//div[@id='invisibility_target']/preceding::button[text()='Trigger'][1]")
	private WebElement WaitForElementIvisibleTrigger_btn;
	
	@FindBy(xpath="//div[@id='invisibility_target']")
	private WebElement loading_Spinner;
	
	@FindBy(xpath="//p[@id='spinner_gone']")
	private WebElement spinner_gone;
	
	
	

	/*************** Test Methods **************/

	public void launchAppURL(String appURL) {
		driver.get(appURL);
	}

	public void clickAddRemoveLink() {
		addRemoveElements_link.click();
	}

	public void verifyAddRemovePage() {
		if(addRemoveElements_header.isDisplayed()){
			System.out.println("addRemoveElements_header is displayed");
		}else {
			System.out.println("addRemoveElements_header is NOT displayed");
		}
	}

	public void clickADDButton() {
		addElement_btn.click();
	}

	public void verifyDELETEButton() {
		if(deleteElement_btn.isDisplayed()) {
			System.out.println("DELETEButton is displayed");
		}else {
			System.out.println("DELETEButton is NOT displayed");
		}
	}

	public void clickDELETEButton() {
		deleteElement_btn.click();
	}

	public void verifyDELETEButton_PostAdd()  {
		try {
			if(deleteElement_btn.isDisplayed()) {

			}else {
				System.out.println("DELETEButton is displayed --->  It is NOT correct");
			}
		} catch (Exception e) {
			System.out.println("DELETEButton is NOT displayed --->  It is correct");
		}
	}

	public void clickOnViewPage() {
		viewPage1.click();		
	}



	/**	TearDown methods **/
	public void closeBrowser() {
//		driver.quit();
		driver.navigate().refresh();
	}

	public void verifyWaitForAlert_Header() throws Exception {
		assertTrue(WaitForAlert_header.isDisplayed(), "WaitForAlert_header is NOT displayed");
	}
	
	public void verfiyButtonDisplayed() throws Exception {
		assertTrue(showAlert_btn.isDisplayed(), "showAlert button is NOT displayed");
	}

	public void clickOnShowAlert() {
		showAlert_btn.click();
	}

	public void acceptAlert() throws TimeoutException {
		waitTillAlertDisplayed();
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}

	public void alertSuccessfull() {
		Assert.assertTrue(alertHandledMsg.isDisplayed());
		System.out.println("Assert PASSED");
	}

	public void verfiyPromptButtonDisplayed() {
			assertTrue(showPrompt_btn.isDisplayed(), "Show Prompt btn is NOT displayed");
	}

	public void clickOnShowPrompt() {
		showPrompt_btn.click();		
	}

	public void alertPromptSuccessfull() throws TimeoutException {
		waitTillAlertDisplayed();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		//First Cancel or Dismiss
		alert.dismiss();		
		assertTrue(showPrompt_CancelMsg.isDisplayed(), "No Cancel Prompt message is showing");
		
		// Now accepting or OK
		showPrompt_btn.click();
		waitTillAlertDisplayed();
		alert.accept();
		assertTrue(showPrompt_OKMsg.isDisplayed(), "No OK Prompt message is showing");
	}

	public void verifyWaitForElement_Header() throws Exception {
		assertTrue(WaitForElementVisible_header.isDisplayed(), "WaitForElementVisible_header is NOT displayed");
		scrollToElement(WaitForElementVisible_header);
	}

	public void clickOnTriggerButtonVisibleSection() {
		WaitForElementVisibleTrigger_btn.click();		
	}

	public void verifyTheClickMeButton() throws TimeoutException {
		waitTillButtonDisplayed(WaitForElementVisibleClickMe_btn);
	}

	public void clickOnClickMeButton() {
		WaitForElementVisibleClickMe_btn.click();
	}

	public void verifyTheDisplayedOptions() throws TimeoutException {
		
		List<WebElement> allOptions = new ArrayList<WebElement>();
		
		allOptions.add(canYouSeeMe);
		allOptions.add(iJustRemovedMyInvisibilityCloak);
		
		System.out.println("Options are : "+allOptions);
		
		waitTillAllElementsDisplayed(allOptions);
		
//		assertTrue(canYouSeeMe.isDisplayed(), "canYouSeeMe is NOT visible");
//		assertTrue(iJustRemovedMyInvisibilityCloak.isDisplayed(), "iJustRemovedMyInvisibilityCloak is NOT visible");
		
	
	}

	public void verifyWaitForElementInvisible_Header() {
		assertTrue(WaitForElementInvisible_header.isDisplayed(), "WaitForElementInvisible_header NOT loaded");
		scrollToElement(WaitForElementInvisible_header);
	}

	public void clickOnTriggerButton_InvisibleSection() {
		WaitForElementIvisibleTrigger_btn.click();
	}

	public void verifyTheInvisibility_Spinner() {
		waitTillElementisInvisible(loading_Spinner);
	}

	public void verifySpinnerGone() throws TimeoutException {
		waitTillElementDisplayed(spinner_gone);		
	}












}
