package com.pack.listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import cucumber.TestContext;
import utils.Utils;

public class MyListener implements ITestListener {

	WebDriver driver = new TestContext().webDriverManager.createLocalDriver();

	@Override
	public void onTestFailure(ITestResult result) {

		String testName=result.getName(); System.out.println(testName +" is failed");
		try { 
			Utils.takeScreenshot(testName, driver); 
		} 
		catch (IOException e) {
			e.printStackTrace(); 
		}
		System.out.println("------------------->  ON FAILURE END");
	}


	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("------------------->  onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("------------------->  onTestSuccess");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("------------------->  onTestSuccess");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("------------------->  onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

}
