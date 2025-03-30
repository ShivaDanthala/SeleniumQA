package otherPractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxes {

	JavascriptExecutor js;
	
	public static void main(String[] args) throws Exception {


		WebDriver driver = new DriverSupply().getDriver();		
		driver.get("https://demoqa.com/automation-practice-form");
//		Thread.sleep(1000);


		WebElement sports_checkbox=driver.findElement(By.id("hobbies-checkbox-1"));		
		WebElement sports_checkboxLabel= driver.findElement(By.xpath("//label[text()='Sports']"));
//		Thread.sleep(3000);
		
		System.out.println(sports_checkboxLabel.getText());
		if(sports_checkbox.isEnabled()){
			System.out.println("Before clicking the Sports checkbox");
			
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", sports_checkbox);
			Thread.sleep(3000);
			((JavascriptExecutor)driver).executeScript("arguments[0].click()", sports_checkbox);
//			sports_checkbox.click();
			System.out.println("After clicking the Sports checkbox");

		}

	}



}
