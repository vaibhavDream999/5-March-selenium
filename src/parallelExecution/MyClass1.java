package parallelExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass1 {
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
}
