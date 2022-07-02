package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void MyMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  System.out.println("MyMethod is running");
  }
  
  @Test
  public void MyMethod2() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  Reporter.log("MyMethod2 is running", true);
  }
  
  @Test
  public void MyMethod3() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://about.facebook.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  Reporter.log("MyMethod3 is running", false);
  }
}
