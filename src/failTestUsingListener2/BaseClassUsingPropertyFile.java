package failTestUsingListener2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import kiteAppUtilityPackage_Utility.UtilityusingPropertyFile;
import net.bytebuddy.utility.RandomString;

public class BaseClassUsingPropertyFile {
	static WebDriver driver;// Here Driver Declared Globally Bcoz Each class will be Used of it.
	
	//Browser Set Up
	//I Want to Seperate MethodFor Browser Calling
	
  public void openBrowser() throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(UtilityusingPropertyFile.readDataFromProperty("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  
  public void takeScreenshot(String TCName) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest= new File("C:\\Users\\Niranjan Shinde\\Pictures\\Utility Screenshot\\myscreenshot"+TCName+".png");
		FileHandler.copy(src, dest);
  }
}