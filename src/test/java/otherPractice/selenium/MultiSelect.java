package otherPractice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws Exception {

		/**
		Launch the browser.
		Open "https://demoqa.com/select-menu".
		Select the Standard Multi-Select using the element id.
		Verifying that the element is multi-select.
		Select 'Opel' using the index and deselect the same using index.
		Select 'Saab' using value and deselect the same using value.
		Deselect all the options.
		Close the browser

		 **/

		WebDriver driver = new DriverSupply().getDriver();		
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);

		WebElement drpdwn= driver.findElement(By.name("cars"));

		Select select = new Select(drpdwn);

		List<WebElement> options= select.getOptions();

		for(WebElement option : options ) {
			System.out.println(option.getText());
		}

		if(select.isMultiple()) {

			select.selectByIndex(2);
			Thread.sleep(2000);

			select.selectByVisibleText("Audi");
			Thread.sleep(2000);

			select.selectByValue("volvo");
			Thread.sleep(2000);

			List<WebElement> slectedOptions= select.getAllSelectedOptions();

			System.out.println("Seleceted options are:");
			for(WebElement slectedOption :slectedOptions) {
				System.out.println(slectedOption.getText());				
			}


			Thread.sleep(2000);
			select.deselectByIndex(2);
			Thread.sleep(1000);
			select.deselectByValue("audi");

			List<WebElement> slectedOptions1= select.getAllSelectedOptions();

			System.out.println("Seleceted options are after deselect some:");
			for(WebElement slectedOption :slectedOptions1) {
				System.out.println(slectedOption.getText());				
			}


			Thread.sleep(2000);
			select.deselectAll();
			Thread.sleep(3000);

		}

		driver.quit();

	}

}
