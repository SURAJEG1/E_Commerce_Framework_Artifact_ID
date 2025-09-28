package testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AmazonSearchPageObject;
import screenshotUtility.ScreenShotUtilities;

public class AmazonSearch_TestCase extends BasicTestComponent{


	@Test
	public void amazonProductSearchAndClickAddToCart_Tc001() throws IOException {
		amazonSearchBox();
		ScreenShotUtilities takeScreenShot=new ScreenShotUtilities(driver);
		takeScreenShot.screenShot();
		//takeScreenShot();
		driver.quit();
	}


	
	
	
	
	
	
	
	
	
	
	


	


	/*
	public void tc001(){
		WebDriver driver=new ChromeDriver();
		AmazonSearchPageObject src=new AmazonSearchPageObject(driver);
		src.searchMacbookPro();
	}


	public void tc002() {
		Assert.assertTrue(2<5);   // Assert.assert for set boolean value (True/False) 
	}


	public void tc003() {
		Assert.assertTrue(5<2);  // Assert.assert for set boolean value (True/False)  
	}

	 */




}
