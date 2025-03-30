package otherPractice.selenium;

import org.openqa.selenium.WebDriver;

public class BrowserCommands {

	public static void main(String[] args) throws Exception {

		
		/**
		    Launch a new Chrome browser.
			Open Shop.DemoQA.com
			Get Page Title name and Title length
			Print Page Title and Title length on the Eclipse Console.
			Get Page URL and verify if it is a correct page opened
			Get Page Source (HTML Source code) and Page Source length
			Print Page Length on Eclipse Console.
			Close the Browser.
		 */
		
		WebDriver driver = new DriverSupply().getDriver();		
		driver.get("https://demoqa.com");
		Thread.sleep(3000);
		
		System.out.println("Page Title is :"+ driver.getTitle());
		
		System.out.println("Title Length is :"+ driver.getTitle().length());
		
		System.out.println("Current URL is :"+ driver.getCurrentUrl());
		
		System.out.println(driver.getCurrentUrl().equals("https://demoqa.com"));
		
		System.out.println("------------------------------");
		
		System.out.println(driver.getPageSource());
		
		System.out.println(driver.getPageSource().length());
		System.out.println();
		System.out.println("------------------------------");
		
		
		driver.close();
	}

}
