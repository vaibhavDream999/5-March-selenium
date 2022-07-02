package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotWithRandomName1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		Thread.sleep(200);
				
		//To take screenshot using selenium webdriver, we need to type cast driver object to Takes Screenshot interface
		// we need call function getscreenshotAs(); there we need to pass the argument 
		// Outputtype. FILE
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(4);
				
		File destination = new File("C:\\Users\\Niranjan Shinde\\Pictures\\screenshot selenium\\cricbuzzpic"+random+".png");
		
		FileHandler.copy(source, destination);
	}

}
