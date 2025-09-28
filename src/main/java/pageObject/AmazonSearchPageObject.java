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

	// Elements
	// Set WebElement by using "PageFactory" Annotation
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") 
	WebElement searchbox;
	
	@FindBy(xpath="//button[@name='submit.addToCart']") 
	WebElement addToCart;

	

    /*
	//Action Method
	public void openAmazonURL() {
		//driver.get("https://www.amazon.in");
		//max();
	}

	//Action Method
	public void  searchbox() {
		//driver.get("https://www.amazon.in");
		//WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//searchbox.sendKeys("MacBook Pro 4");
		//searchbox.submit();
	}
	*/

	//Action Method
	public void searchMacbookProAndClickAddToCart() {
		max();
		driver.get("https://www.amazon.in");
		//WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("Macbook Pro");
		searchbox.submit();
		addToCart.click();
		
	}



	
	
	
	
	
	
	
	
	
	
	

}
