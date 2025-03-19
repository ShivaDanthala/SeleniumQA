package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utilities.IConstants;

public class WebDriverManager implements IConstants {

	public static WebDriver web_driver;
	//	public EventFiringWebDriver driver;
	public static String present_path;

	//	switch(browser) {
//		public WebDriver getDriver() {
//			if(driver==null)
//			driver = (EventFiringWebDriver)createLocalDriver();
//			return driver;
//		}

	public WebDriver createLocalDriver() {
		String browserName = FileReaderManager.getInstance().getConfigFileReader().getBrowser();
		System.out.println("Browser is " +browserName);
		present_path=System.getProperty("user.dir");

		switch(browserName){
		case "CHROME":
			String chrome_driver =present_path + CHROME_PATH;
			System.setProperty(CHROME_KEY, chrome_driver);
			
			ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--start-maximized");
//			options.addExtensions (new File("C:\\Users\\DELL\\Downloads\\undefined 2.1.24.0.crx"));
//			options.addArguments("disable-infobars");
//			options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
			
			if(web_driver==null) {
				web_driver = new ChromeDriver(options);
				System.out.println("Chrome driver initializing....");
			}
			break;
		}
		return web_driver;
	}

	public void closeDriver() {
		web_driver.quit();
	}
	
	

}
