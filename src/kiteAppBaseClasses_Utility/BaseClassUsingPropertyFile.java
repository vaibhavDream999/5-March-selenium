package kiteAppBaseClasses_Utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteAppUtilityPackage_Utility.UtilityusingPropertyFile;

public class BaseClassUsingPropertyFile {
	protected WebDriver driver;// Here Driver Declared Globally Bcoz Each class will be Used of it.
	
	//Browser Set Up
	//I Want to Seperate MethodFor Browser Calling
	
  public void openBrowser() throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(UtilityusingPropertyFile.readDataFromProperty("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
}