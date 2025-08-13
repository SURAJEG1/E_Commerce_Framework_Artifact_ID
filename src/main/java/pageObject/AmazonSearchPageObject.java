package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableAbsrtactComponent.AbstractComponent;

public class AmazonSearchPageObject extends AbstractComponent {

	// Variable
	WebDriver driver;
	// Constructor
	public AmazonSearchPageObject(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// Set WebElement by using "PageFactory" Annotation
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") WebElement searchbox;


	public void openAmazonURL() {
		driver.get("https://www.amazon.in");
		max();
	}


	public void  searchbox() {
		//driver.get("https://www.amazon.in");
		//WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//searchbox.sendKeys("MacBook Pro 4");
		//searchbox.submit();
	}


	public void searchMacbookPro() {
		driver.get("https://www.amazon.in");
		max();
		//WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("Macbook Pro 4");
		searchbox.submit();
		quit();
	}




}
