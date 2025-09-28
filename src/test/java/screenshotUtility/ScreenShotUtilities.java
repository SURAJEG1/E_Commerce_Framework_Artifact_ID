package screenshotUtility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtilities {


	WebDriver driver;
	public ScreenShotUtilities (WebDriver driver) {
		this.driver=driver;

	}
	public void screenShot() throws IOException  {

		//step1: convert WebDriver object to TakesScreenshot interface
		TakesScreenshot screenshot = (TakesScreenshot)driver;

		//Timestamp for date format
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHss").format(new Date());
		

		// step2: call getScreenshotAs method to create image file
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\InfoEge Automation Project\\E_Commerce_Framework_Artifact_ID\\screenshot\\Screenshot_"+timestamp+".png");

		//step3:copy image file to destination
		FileUtils.copyFile(source, destination);

	}














}
