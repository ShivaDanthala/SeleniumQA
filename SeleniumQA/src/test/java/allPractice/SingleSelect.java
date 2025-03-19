package allPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		
		/** Our use-case would follow the steps below-

		Launch the browser.
		Open "https://demoqa.com/select-menu".
		Select the Old Style Select Menu using the element id.
		Print all the options of the dropdown.
		Select 'Purple' using the index.
		After that, select 'Magenta' using visible text.
		Select an option using value.
		Close the browser **/
		
		
		WebDriver driver = new DriverSupply().getDriver();		
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		
		WebElement drpdwn = driver.findElement(By.id("oldSelectMenu"));		
		Select select = new Select(drpdwn);
		
		List<WebElement> options =select.getOptions();
		System.out.println("Availble options are :");
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		
		
		select.selectByIndex(3);
		Thread.sleep(1000);
		
		select.selectByVisibleText("Magenta");
		Thread.sleep(1000);
		
		select.selectByValue("5");
		
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
