package managers;

import org.openqa.selenium.WebDriver;

import pages.AllElementsPage;
import pages.FormPage;
import pages.LoginPage;

public class WebPageObjectManager {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private FormPage formPage;
	private AllElementsPage allElementsPage;
	
	public WebPageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage getLoginPage() {
//		System.out.println("Inside getLoginPage");
		return (loginPage==null)? loginPage= new LoginPage(this.driver): loginPage;
	}
	
	public FormPage getFormPage() {
//		System.out.println("Inside getFormPage");
		return (formPage==null)? formPage= new FormPage(this.driver): formPage;
	}

	public AllElementsPage getAllElementPage() {
		return (allElementsPage==null)? new AllElementsPage(this.driver):allElementsPage;
	}

}
