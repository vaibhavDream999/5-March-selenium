package kiteWithExcel;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class KiteTestCrossBrowser {
	// Create object of classes which are required in TestNG class
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	WebDriver driver;
	Sheet Mysheet;
	
  @Parameters("browser")
  @BeforeClass
  public void luanchBrowser(String browser) throws EncryptedDocumentException, IOException 
  {
	  // FOr luanch browser first do regular procedure
	  if(browser.equals("chrome")) 
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  driver= new ChromeDriver();
	  }
	  else if (browser.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		  driver= new FirefoxDriver();
	  }
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  Reporter.log("luanching url", true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  login= new KiteLoginPage(driver);// Initialize the variable 
	  pin= new KitePinPage(driver);// which is declared as above
	  home= new KiteHomePage(driver);
	  File Myfile= new File("C:\\Users\\Niranjan Shinde\\Documents\\velocity practise API.xlsx");
	  Mysheet= WorkbookFactory.create(Myfile).getSheet("Sheet5");
  }
  @BeforeMethod
  public void loginToKite() 
  {
	  login.sendUserName(Mysheet.getRow(0).getCell(0).getStringCellValue());
	  Reporter.log("sending username", true);
	  login.sendPassword(Mysheet.getRow(0).getCell(1).getStringCellValue());
	  Reporter.log("sending password", true);
	  login.clickOnLoginButton();
	  Reporter.log("clicking on login button", true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  pin.sendPin(Mysheet.getRow(0).getCell(2).getStringCellValue());
	  Reporter.log("sending pin", true);
	  pin.clickOnContinueButton();
	  Reporter.log("clicking on continue button", true);
  }
  @Test
  public void validateKiteUserName()
  {
	  // Expected username--> From Excel Sheet
	  // Actual username  --> From POM Class
	 String ExpecteduserID = Mysheet.getRow(0).getCell(0).getStringCellValue();
	 String actualuserID = home.getActualUserID();
	 Reporter.log("validating on login button", true);
	 Assert.assertEquals(ExpecteduserID, actualuserID, "Expected userID And Actual userID are not matched , TC is failed");
	 Reporter.log("Expected userID And Actual userID are matched , TC is passed", true);
  }
  @AfterMethod
  public void LogOutFromKiteApp() throws InterruptedException 
  {
	  home.ClickOnLogOutButton();
	  Reporter.log("clicking on logout button", true);
  }
  @AfterClass
  public void CloseBrowser() 
  {
	  driver.close();
	  Reporter.log("closing of browser", true);
  }
}
