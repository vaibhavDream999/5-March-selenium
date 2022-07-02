package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotWithRandomName {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(200);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(5);
		
		File Destination=new File("C:\\Users\\Niranjan Shinde\\Pictures\\screenshot selenium\\multiple1"+random+".png");
		
		FileHandler.copy(source, Destination);
	}

}

