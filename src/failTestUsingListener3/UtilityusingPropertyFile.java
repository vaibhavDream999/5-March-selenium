package failTestUsingListener3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityusingPropertyFile {

	// Takes Screenshot Activity
//	  public static void takeScreenshot(WebDriver driver) throws IOException 
//		{
//			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			String random = RandomString.make(3);
//			File dest= new File("C:\\Users\\Niranjan Shinde\\Pictures\\Utility Screenshot\\myscreenshot"+random+".png");
//			FileHandler.copy(src, dest);
//	    }
//	  
	  public static String readDataFromProperty(String key) throws IOException 
	  {
		Properties prop= new Properties();// It is an java utility class
		FileInputStream myprop= new FileInputStream("C:\\Users\\Niranjan Shinde\\eclipse-workspace\\Selenium_Project\\myproperty.properties");
		prop.load(myprop);
		String value = prop.getProperty(key);
		return value;
		  
	  }
	  
	  public static void implicitly(WebDriver driver, int timeUnit) 
	  {
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeUnit));
	  }
}
