package verificationUsingHardAssertTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerificationNormalWay {
  @Test
  public void MyTC() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		// TestNG can not behave as a normal class , they works on their rule while normal class works on their rule
//		if(checkbox1.isSelected()) 
//		{
//			Reporter.log("TC is passed", true);
//		}
//		else 
//		{
//			Reporter.log("TC is failed", true);
//		}
		
		
		checkbox1.click();//use for TC passed
		Assert.assertTrue(checkbox1.isSelected(),"checkbox1 is not selected and TC is failed");
		Reporter.log("checkbox is selected and TC is passed", true);
		//Assert.assertFalse(checkbox1.isSelected(),"checkbox is selected and TC is passed");
		//its also use for tC passed
  }
}
