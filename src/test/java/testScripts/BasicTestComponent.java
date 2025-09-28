package testScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.AmazonSearchPageObject;
import screenshotUtility.ScreenShotUtilities;


public class BasicTestComponent  {
	WebDriver driver;
	public WebDriver initializedDriver() throws IOException {
		Properties pr=new Properties();
		FileInputStream fis=new FileInputStream("E:\\InfoEge Automation Project\\E_Commerce_Framework_Artifact_ID\\src\\main\\java\\resource\\globalData.properties");
		pr.load(fis);
		String browser_Name = pr.getProperty("browser");
		if(browser_Name.equalsIgnoreCase("chrome")) {

			driver=new ChromeDriver();
		}
		
		return driver;
	}

	
	public void amazonSearchBox() throws IOException {
		driver=initializedDriver();
		AmazonSearchPageObject searchMBP= new AmazonSearchPageObject(driver);
		searchMBP.searchMacbookProAndClickAddToCart();
	}



	//Screenshot class object
	/*
	public void takeScreenShot() throws IOException {
		ScreenShotUtilities scrShot=new ScreenShotUtilities(driver);
		scrShot.screenShot();
	}
    */

}













