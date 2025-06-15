package managers;

import org.openqa.selenium.WebDriver;

import pages.AllElementsPage;
import pages.FormPage;
import pages.LoginPage;
import pages.WaitConditionsPage;

public class WebPageObjectManager {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private FormPage formPage;
	private AllElementsPage allElementsPage;
	private WaitConditionsPage waitConditionsPage;
	
	public WebPageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage getLoginPage() {
		return (loginPage==null)? loginPage= new LoginPage(this.driver): loginPage;
	}
	
	public FormPage getFormPage() {
		return (formPage==null)? formPage= new FormPage(this.driver): formPage;
	}

	public AllElementsPage getAllElementPage() {
		return (allElementsPage==null)? new AllElementsPage(this.driver):allElementsPage;
	}

	public WaitConditionsPage getWaitConditionsPage() {
		return (waitConditionsPage==null)? new WaitConditionsPage(this.driver):waitConditionsPage;
	}

}
