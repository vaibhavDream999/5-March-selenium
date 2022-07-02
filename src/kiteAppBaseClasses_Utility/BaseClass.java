package kiteAppBaseClasses_Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;// Here Driver Declared Globally Bcoz Each class will be Used of it.
	
	//Browser Set Up
	//I Want to Seperate MethodFor Browser Calling
	
  public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
}