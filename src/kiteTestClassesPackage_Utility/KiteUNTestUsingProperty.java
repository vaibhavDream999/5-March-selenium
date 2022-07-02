package kiteTestClassesPackage_Utility;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClasses_Utility.BaseClassUsingPropertyFile;
import kiteAppUtilityPackage_Utility.UtilityusingPropertyFile;
import kitePomClassesPackage_Utility.KiteHomePage;
import kitePomClassesPackage_Utility.KiteLoginPage;
import kitePomClassesPackage_Utility.KitePinPage;

public class KiteUNTestUsingProperty extends BaseClassUsingPropertyFile {
	KiteLoginPage login2;
	KiteHomePage home2;
	KitePinPage pin2;
	
@BeforeClass
	public void launchBrowser() throws IOException 
	{
		openBrowser();
		login2= new KiteLoginPage(driver);
		pin2= new KitePinPage(driver);
		home2= new KiteHomePage(driver);
	}

@BeforeMethod
	public void loginToKIteApp() throws IOException 
    {
		login2.sendUserName(UtilityusingPropertyFile.readDataFromProperty("UN"));
		login2.sendPassword(UtilityusingPropertyFile.readDataFromProperty("PWD"));
		login2.clickOnLoginButton();
		UtilityusingPropertyFile.implicitly(driver, 100);
		
		pin2.sendPin(UtilityusingPropertyFile.readDataFromProperty("PIN"));
		pin2.clickOnContinueButton();
		UtilityusingPropertyFile.implicitly(driver, 100);
    }
 @Test
    public void validateUserName() throws IOException 
 	{
	 	String actualUN = home2.getActualUserID();
	 	String expectedUN = UtilityusingPropertyFile.readDataFromProperty("UN");
	 	Assert.assertEquals(actualUN, expectedUN, "Actual UN and Expected UN are not matched TC is failed");
	 	Reporter.log("Actual UN and Expected UN are matched TC is passed", true);
	 	UtilityusingPropertyFile.takeScreenshot(driver);
 	}
 
 @AfterMethod
 	public void logOutFromKite() throws InterruptedException 
 	{
	 	home2.ClickOnLogOutButton();
 	}
 
 @AfterClass
 	public void CloseBrowser() throws InterruptedException 
 	{
	 	Thread.sleep(1000);
	 	driver.close();
 	}
}
