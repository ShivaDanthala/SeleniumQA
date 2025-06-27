package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.WebDriverManager;
import pages.PopupWindowsPage;

public class PopupWindowsSteps extends WebDriverManager{

	public TestContext testContext;
	PopupWindowsPage popupWindowsPage;
	String path ="C:\\SeleniumQA\\src\\test\\resources\\configurations\\TestData.xlsx";

	public PopupWindowsSteps() {
		testContext = new TestContext();
		popupWindowsPage = testContext.getWebPageObjectManager().getPopupWindowsPage();
	}


	@When("click on Popup Windows View Page button")
	public void click_on_popup_windows_view_page_button() {
		popupWindowsPage.clickOnViewPage_PopUpWindows();
	}

	@Then("verify the {string} of the page")
	public void verify_the_of_the_page(String title) {
		popupWindowsPage.verifyPageTitle(title);
	}

	@Then("verify all the buttons for Popup Windows")
	public void verify_all_the_buttons_for_popup_windows() {
		popupWindowsPage.getAllPopupindows();
	}

	@Then("navigate back to Home page")
	public void navigate_back_to_home_page() throws Exception {
		popupWindowsPage.navigateBack();
	}

	@Then("click on Open New Window1 button and verify a new window is opened with title {string}")
	public void click_on_open_new_window1_button_and_verify_a_new_window_is_opened_with_title(String windowName1) {
		popupWindowsPage.getMainWindow();
		popupWindowsPage.clickWindow1();
		popupWindowsPage.navigateToOtherWindow(windowName1);
	}

	@Then("verify ClickMe2 button is displayed")
	public void verify_click_me2_button_is_displayed() {
		popupWindowsPage.verifyClickMe2Button();
	}

	@Then("click on ClickMe2 button")
	public void click_on_click_me2_button() {
		popupWindowsPage.clickOn_ClickMe2Button();
	}

	@Then("verify the successful clicked")
	public void verify_the_successful_clicked() {
		popupWindowsPage.verifyClickedButton();
	}

	@Then("close the current window")
	public void close_the_current_window() {
		popupWindowsPage.closeCurrentWindow();
		popupWindowsPage.switchToMainWindow();
	}

	@Then("click on Open New Window2 button and verify a new window is opened with title {string}")
	public void click_on_open_new_window2_button_and_verify_a_new_window_is_opened_with_title(String windowName2) {
		popupWindowsPage.getMainWindow();
		popupWindowsPage.clickWindow2();
		popupWindowsPage.navigateToOtherWindow(windowName2);
	}

	@Then("Switch to New Window2 {string}")
	public void switch_to_new_window2(String windowName2) {
		popupWindowsPage.switchToCurrentWindow(windowName2);
	}

	
	@Then("verify ClickMe4 button is displayed")
	public void verify_click_me4_button_is_displayed() {
		popupWindowsPage.verifyClickMe4Button();
	}

	@Then("click on ClickMe4 button")
	public void click_on_click_me4_button() {
		popupWindowsPage.clickOn_ClickMe4Button();
	}

	@Then("click on Open New Window1")
	public void click_on_open_new_window1() {
		popupWindowsPage.clickWindow1();
	}
	
	@Then("Switch back to main window {string}")
	public void switch_back_to_main_window(String mainWindow) {
		popupWindowsPage.getMainWindow();
		popupWindowsPage.switchToMainWindow();
	}
	
	@Then("click on Open New Window2")
	public void click_on_open_new_window2() {
		popupWindowsPage.clickWindow2();
	}
	
	@Then("Switch back to New Window1 {string}")
	public void switch_back_to_new_window1(String window1) {
		popupWindowsPage.navigateToOtherWindow(window1);
	}
	@Then("Switch back to New Window2 {string}")
	public void switch_back_to_new_window2(String window2) {
		popupWindowsPage.navigateToOtherWindow(window2);
	}





}
