package testScripts;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AmazonSearchPageObject;

public class AmazonSearch_TestCase {
	

	@Test
	public void tc001(){
		WebDriver driver=new ChromeDriver();
		AmazonSearchPageObject src=new AmazonSearchPageObject(driver);
		src.searchMacbookPro();
	}
	
	@Test
	public void tc002() {
		Assert.assertTrue(2<5);
	}
	
	@Test
	public void tc003() {
		Assert.assertTrue(5<2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
