package cucumber;

import enums.EnvironmentType;
import managers.FileReaderManager;
import managers.WebDriverManager;
import managers.WebPageObjectManager;

public class TestContext {
	private static EnvironmentType environmentType;
	public WebDriverManager webDriverManager;
	private WebPageObjectManager webPageObjectManager;
	
	public TestContext() {
		webDriverManager = new WebDriverManager();
		environmentType= FileReaderManager.getInstance().getConfigFileReader().getEnvironment();
		
		//System.out.println(environmentType);
		switch(environmentType) {
		case BROWSER:
			webPageObjectManager = new WebPageObjectManager(webDriverManager.createLocalDriver());
			break;
		case MOBILE:
			webPageObjectManager = new WebPageObjectManager(webDriverManager.createLocalDriver());
			break;
		}
		
	}

	public WebPageObjectManager getWebPageObjectManager() {
		return webPageObjectManager;
	}

}
