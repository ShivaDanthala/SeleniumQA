package pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopupWindowsPage extends BasePage {

	public PopupWindowsPage(WebDriver driver) {
		super(driver);
	}

	String mainWindow;

	@FindBy(xpath="//a[@href='multi_window.html']")
	private WebElement popupWidowsViewPage_btn;

	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement allPopupWindow_btns;

	@FindBy(xpath="//a[text()='Open New Window 1']")
	private WebElement newWindow1_btn;

	@FindBy(xpath="//a[text()='Open New Window 2']")
	private WebElement newWindow2_btn;

	@FindBy(xpath="//button[text()='Click Me 2']")
	private WebElement clickMe2_btn;

	@FindBy(xpath="//button[text()='Click Me 4']")
	private WebElement clickMe4_btn;

	@FindBy(xpath="//button[text()='Clicked']")
	private WebElement clicked_btn;



	public void clickOnViewPage_PopUpWindows() {
		popupWidowsViewPage_btn.click();
	}

	public void verifyPageTitle(String title) {
		verify_PageTitle(title);
	}

	public void getAllPopupindows() {

		List<WebElement> allBtns =driver.findElements(By.xpath("//a[@class='btn btn-primary']"));

		for(WebElement btn:allBtns) {
			System.out.println(btn.getText());
		}
	}

	public void getMainWindow() {
		mainWindow = driver.getWindowHandle();
		System.out.println("Main Window is "+mainWindow);
	}

	public void clickWindow1() {
		newWindow1_btn.click();
	}

	public void navigateToOtherWindow(String windowName) {

		System.out.println("Main Window :" +mainWindow);
		Set<String> allWindows= driver.getWindowHandles();
		System.out.println("Available windows are :"+allWindows.size());
		allWindows.forEach(window -> System.out.println(window));

		for(String currentWindow :allWindows) {

			if(!mainWindow.equals(currentWindow)) {
				if(driver.switchTo().window(currentWindow).getTitle().equalsIgnoreCase(windowName)) {
					driver.switchTo().window(currentWindow);
					System.out.println("Switched to other Window : "+driver.getTitle());
					break;
				}
			}
		}
	}
	
	public void switchToCurrentWindow(String windowName) {

		Set<String> allWindows= driver.getWindowHandles();

		for(String currentWindow :allWindows) {
			
			if(driver.switchTo().window(currentWindow).getTitle().equalsIgnoreCase(windowName)) {
				driver.switchTo().window(currentWindow);
				System.out.println("Switched current to Window : "+driver.getTitle());
				break;
			}
		}
	}

	public void clickWindow2() {
		newWindow2_btn.click();
	}

	public void verifyClickMe2Button() {
		isDisplayed(clickMe2_btn);
	}

	public void clickOn_ClickMe2Button() {
		clickMe2_btn.click();
	}

	public void verifyClickedButton() {
		isDisplayed(clicked_btn);
	}

	public void verifyClickMe4Button() {
		isDisplayed(clickMe4_btn);
	}

	public void clickOn_ClickMe4Button() {
		clickMe4_btn.click();		
	}

	public void switchToMainWindow() {
		driver.switchTo().window(mainWindow);
	}

	










}
