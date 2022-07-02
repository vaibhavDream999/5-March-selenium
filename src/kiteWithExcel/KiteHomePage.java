package kiteWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	// In Page Object module , We Cant Use Main Method
	//1.Data Members / Variable
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userID;

	@FindBy(xpath = "//a[@target='_self']")private WebElement logOutButton;
	
	//2.Constructor
	// Here we Will use PageFactory class
	// If we use UN,PWD,loginButton as a parameter , then we want to create Constructor at 2 times
	// so we can use "Webdriver driver" as a parameter
	public KiteHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Methods
	// Now we make some changes
	public String getActualUserID() 
	{
		String actualUserID = userID.getText();
		return actualUserID;
	}
	// it will be used for this class only
	public void ValidateUserID(String expectedusername) 
	{
		String actualUserID = userID.getText();
		String expactedUserID = expectedusername;
		
		if(actualUserID.equals(expactedUserID))
		{
			System.out.println("UserID is matching and TC is Pass");
		}
		else 
		{
			System.out.println("UserID is not matching and TC is Fail");
		}
	}
//	
	public void ClickOnLogOutButton() throws InterruptedException 
	{
		userID.click();
		Thread.sleep(500);
		logOutButton.click();
	}
}
