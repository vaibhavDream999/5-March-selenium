package kitePomClassesPackage_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

		// In Page Object module , We Cant Use Main Method
	
		//1.Data Members / Variable
		@FindBy(id = "userid") private WebElement UN;// username find by @FindBy Annotation
		
		@FindBy(id = "password") private WebElement PWD;// Password find by @FindBy Annotation
		
		@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;// loginButton find by @FindBy Annotation
	
		//2.Constructor
		// Here we Will use PageFactory class
		// If we use UN,PWD,loginButton as a parameter , then we want to create Constructor at 3 times
		// so we can use "Webdriver driver" as a parameter
		
		public KiteLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);// "this" will be use to call global variable(UN,PWD,loginButton)
		}

		//3.Methods
		public void sendUserName(String userName) 
		{
			UN.sendKeys(userName);
		}
		
		public void sendPassword(String pwd) 
		{
			PWD.sendKeys(pwd);
		}
		
		public void clickOnLoginButton() 
		{
			loginButton.click();
		}
}


