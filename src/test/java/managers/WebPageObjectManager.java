package managers;

import org.openqa.selenium.WebDriver;

import pages.FormPage;
import pages.LoginPage;
import pages.PopupWindowsPage;
import pages.WaitConditionsPage;

public class WebPageObjectManager {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private FormPage formPage;
	private WaitConditionsPage waitConditionsPage;
	private PopupWindowsPage popupWindowsPage;
	
	public WebPageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage getLoginPage() {
		return (loginPage==null)? loginPage= new LoginPage(this.driver): loginPage;
	}
	
	public FormPage getFormPage() {
		return (formPage==null)? formPage= new FormPage(this.driver): formPage;
	}

	public WaitConditionsPage getWaitConditionsPage() {
		return (waitConditionsPage==null)? new WaitConditionsPage(this.driver):waitConditionsPage;
	}

	public PopupWindowsPage getPopupWindowsPage() {
		
		return (popupWindowsPage==null)? new PopupWindowsPage(this.driver):popupWindowsPage;
	}

}
