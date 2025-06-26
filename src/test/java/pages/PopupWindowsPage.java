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

	public void navigateTo_NewWindow(String windowName) {

		String mainWindow= driver.getWindowHandle();
		System.out.println("main Window is "+mainWindow);
		newWindow1_btn.click();

		Set<String> allWindows= driver.getWindowHandles();

		for(String currentWindow :allWindows) {
			System.out.println("Current Window is : "+currentWindow);

			if(!mainWindow.equalsIgnoreCase(currentWindow)) {
				(driver.switchTo().window(currentWindow).getTitle()).equalsIgnoreCase(windowName);
				System.out.println("Window name is matched : "+driver.switchTo().window(currentWindow).getTitle());
				break;
			}
		}

	}

	public void navigateTo_NewWindow2(String windowName) {

		String mainWindow= driver.getWindowHandle();
		System.out.println("main Window is "+mainWindow);
		newWindow2_btn.click();

		Set<String> allWindows= driver.getWindowHandles();

		for(String currentWindow :allWindows) {
			System.out.println("Current Window is : "+currentWindow);

			if(!mainWindow.equalsIgnoreCase(currentWindow)) {
				(driver.switchTo().window(currentWindow).getTitle()).equalsIgnoreCase(windowName);
				System.out.println("Window name is matched : "+driver.switchTo().window(currentWindow).getTitle());
				break;
			}
		}

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












}
