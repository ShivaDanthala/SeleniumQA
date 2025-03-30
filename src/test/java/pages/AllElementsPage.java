package pages;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllElementsPage extends BasePage {

	public AllElementsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h5[text()='Forms']")
	private WebElement formHeader;
	
	
	public void launch_Form_URL() throws TimeoutException {
		driver.get("https://the-internet.herokuapp.com/");
		waitTillElementDisplayed(formHeader);  // Implemented Explicit wait using WebDriver Wait
	}


	public void launchAppURL(String appURL) {
		driver.get(appURL);
		
	}

}
