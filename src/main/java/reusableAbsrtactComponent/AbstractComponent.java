package reusableAbsrtactComponent;

import org.openqa.selenium.WebDriver;

public class AbstractComponent {
	
	WebDriver driver;
	//Constructor
	public AbstractComponent(WebDriver driver) {
		this.driver=driver;
	}
	
	public void max() {
		driver.manage().window().maximize();
	}
	
	public void min() {
		driver.manage().window().minimize();
	}
	
	
	public void quit() {
		driver.quit();
	}
	
	
	
	
	

}
