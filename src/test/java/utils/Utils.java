package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {

	TakesScreenshot screenshot;
	static String screenshotPath= "C://SeleniumQA//target/screenshots/";

	public static void takeScreenshot(String scenarioName, WebDriver driver) throws IOException {

		File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		System.out.println("Source file name is ----------> " +scrFile);

		//File destFile = new File(screenshotPath);		
		//System.out.println("Destination file name is ----------> " +destFile);
		
		System.out.println("TimeStamp is - "+getTimeStamp());
		
		FileUtils.copyFile(scrFile, new File(screenshotPath+getTimeStamp()+".png"));
		
	}

	public static String getDate() {
		Date date = new Date();
		SimpleDateFormat sf= new SimpleDateFormat("dd_mm_yyyy_hh_mm_ss");
		return sf.format(date.getTime());
	}

	public static long getTimeStamp(){

		Date date = new Date();
		long time = date.getTime();
		return time;

	}
}
