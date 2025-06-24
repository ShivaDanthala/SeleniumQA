package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	private WebDriverWait wait;
//	JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void closeBrowser() {
		//driver.quit();
		driver.navigate().refresh();
	}
	
	public void refreshBrowser() {
		driver.navigate().refresh();
	}

	public void launchAppURL(String appURL) {
		driver.get(appURL);
	}
	
	/**
	 * 
	 * JavascriptExecutor methods 
	 * 
	 * **/
	
	public void scrollToElement(WebElement toElement) {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", toElement);
	}
	
	public void clickOnElement(WebElement elementToClick) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", elementToClick);
	}
	
	public void enterText(WebElement textToElement, String text) {
		((JavascriptExecutor)driver).executeScript("arguments[0].value=text", textToElement);
	}
	
	
	/**	
	 * 
	 * WebDriver Wait methods 
	 * 
	 * **/
	
	public void waitTillElementDisplayed(WebElement elementToDisplay) throws TimeoutException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(elementToDisplay));
		System.out.println("waited Till Element is visible for :"+elementToDisplay.getText());
	}
	
	public void waitTillAllElementsDisplayed(List<WebElement> allElements) throws TimeoutException{
		wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(allElements));
		System.out.println("waited Till AllElements Displayed");
	}
	
	public void waitTillElementisInvisible(WebElement invisibleElement) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.invisibilityOf(invisibleElement));
		System.out.println("waited Till Element is Invisible for :"+invisibleElement.getText());
	}
	
	public void waitTillAlertDisplayed() throws TimeoutException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("waited Till Alert Displayed");
	}
	
	public void waitTillButtonDisplayed(WebElement elementofButton) throws TimeoutException{
		wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(elementofButton));
		System.out.println("waited visibility of Button for :"+elementofButton.getText());
	}
	
	
	/**	
	 * 
	 * Assertions methods 
	 * 
	 * **/
	
	public void assert_isDisplayed(WebElement btnDisplayed) {
		assertTrue(btnDisplayed.isDisplayed(), " The " +btnDisplayed.getText()+ "is NOT displayed");
	}
	
	public void assert_Equals(String actual, String expected) {
		assertEquals(actual, expected);
	}
}
