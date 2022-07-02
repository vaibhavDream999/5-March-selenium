package pom1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassByUsingTestNG
{/////// THIS IS WRONG CLASS GENERATED BY ME , PLEASE DONT REFER IT
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	WebDriver driver;
	
	
	@BeforeClass
	public void LaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		home = new KiteHomePage(driver);
		login = new KiteLoginPage(driver);
		pin = new KitePinPage(driver);
	}
	@BeforeMethod
	public void LogInToKiteApp() 
	{
		
	}
	@Test
	public void verifyUserID()
	{
		
	}
	@AfterMethod
	public void LogOutFromKiteApp() 
	{
		
	}
	@AfterClass
	public void CloseBrowser() 
	{
		
	}
}