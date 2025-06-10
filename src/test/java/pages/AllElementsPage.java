package pages;

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

	

	/**	TearDown methods **/
	public void closeBrowser() {
		driver.quit();		
	}






}
