package allPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationCommands {

	public static void main(String[] args) throws Exception {


		/**
		 * 	Launch new Browser
			Open DemoQA.com website
			Click on Registration link using "driver.findElement(By.xpath(".//[@id='menu-item-374']/a")).click();"*
			Come back to Home page (Use 'Back' command)
			Again go back to Registration page (This time use 'Forward' command)
			Again come back to Home page (This time use 'To' command)
			Refresh the Browser (Use 'Refresh' command)
			Close the Browser
		 */

		WebDriver driver = new DriverSupply().getDriver();		
		driver.get("https://demoqa.com");
		Thread.sleep(3000);
		
		WebElement froms_div=driver.findElement(By.xpath("//h5[text()='Forms']"));
		
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", froms_div);
//		froms_div.click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().to("https://demoqa.com");
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.close();
		

		
	}

}
