package kiteTestClassesPackage_Utility;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClasses_Utility.BaseClass;
import kiteAppUtilityPackage_Utility.UtilityClass;
import kitePomClassesPackage_Utility.KiteHomePage;
import kitePomClassesPackage_Utility.KiteLoginPage;
import kitePomClassesPackage_Utility.KitePinPage;

public class ValidateKiteAppUserID extends BaseClass {
	KiteLoginPage login1;
	KitePinPage pin1;
	KiteHomePage home1;
	
  @BeforeClass
	public void launchBrowser() 
	{
		openBrowser();
		login1= new KiteLoginPage(driver);
		pin1= new KitePinPage(driver);
		home1= new KiteHomePage(driver);
	}
  
  @BeforeMethod
    public void loginToKiteApp() throws EncryptedDocumentException, IOException 
    {
	  login1.sendUserName(UtilityClass.readDataFromExcelSheet(0,0));
	  login1.sendPassword(UtilityClass.readDataFromExcelSheet(0,1));
	  login1.clickOnLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
	  pin1.sendPin(UtilityClass.readDataFromExcelSheet(0, 2));
	  pin1.clickOnContinueButton();
    }
  
  @Test
    public void ValidateUserName() throws EncryptedDocumentException, IOException
  {
	  String actualUserName = home1.getActualUserID();
	 String expectedUserName = UtilityClass.readDataFromExcelSheet(0, 0);
	 Assert.assertEquals(actualUserName, expectedUserName, "TC is failed actual and expected username not matched");
	 Reporter.log("username is matching and TC is Passed", true);
	 UtilityClass.takeScreenshot(driver);
  }
  
  @AfterMethod
  public void logOutFromKiteApp() throws InterruptedException 
  {
	  home1.ClickOnLogOutButton();
  }
  
  @AfterClass
  public void  CloseBrowser() 
  {
	  driver.close();
  }
}
