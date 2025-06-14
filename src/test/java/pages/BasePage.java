package pages;

import java.time.Duration;
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
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
		//this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	
	
	/**	JavascriptExecutor methods **/
	
	public void scrollToElement(WebElement toElement) {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", toElement);
	}
	
	public void clickOnElement(WebElement elementToClick) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", elementToClick);
	}
	
	public void enterText(WebElement textToElement, String text) {
		((JavascriptExecutor)driver).executeScript("arguments[0].value=text", textToElement);
	}
	
	
	/**	WebDriver Wait methods **/
	
	public void waitTillElementDisplayed(WebElement elementToDisplay) throws TimeoutException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(elementToDisplay));
//		wait.until(ExpectedConditions.)
	}
	
	public void waitTillAlertDisplayed() throws TimeoutException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println("waitTillAlertDisplayed");
	}
	
}
