package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {

	// In Page Object module , We Cant Use Main Method
	//1.Data Members / Variable
	@FindBy(id = "pin")private WebElement PIN;
	
	@FindBy(xpath = "//button[@type='submit']")private WebElement ContinueButton;
	
	//2.Constructor
	// Here we Will use PageFactory class
	// If we use UN,PWD,loginButton as a parameter , then we want to create Constructor at 2 times
	// so we can use "Webdriver driver" as a parameter
	public KitePinPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Methods
	public void sendPin() 
	{
		PIN.sendKeys("982278");
	}
	public void clickOnContinueButton() 
	{
		ContinueButton.click();
	}
}
