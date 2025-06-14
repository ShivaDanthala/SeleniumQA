package pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Roughwork extends BasePage {

	public Roughwork(WebDriver driver) {
		super(driver);	}

	// Handle multiple windows.

	public void swithToWindow(String curentwindow) {

		Set<String> allWindows=	driver.getWindowHandles();

		for(String window:allWindows) {

			if(!curentwindow.equalsIgnoreCase(window)) {
				driver.switchTo().window(window);
				//perform test here then close window
				driver.close();
			}
		}
	}

	public void selectFromDropDown() {
		//https://the-internet.herokuapp.com/dropdown

		WebElement optionDropdown=driver.findElement(By.id("dropdown")); // locator for select tag

		Select select = new Select(optionDropdown);

		select.selectByVisibleText("Option 1");

		select.selectByIndex(0);

		select.selectByValue("1");

		// as well deselect the same

		List<WebElement> allOptions=select.getOptions(); // returns all the options from dropdown

		for(WebElement option:allOptions) {

			if(option.getText().equalsIgnoreCase("Option 1")) {
				select.selectByVisibleText(option.getText());
				break;
			}
		}
	}




















}
