package scorlling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		JavascriptExecutor ba = ((JavascriptExecutor)driver);
		// +ve x value--> right hand side, Y value +ve --> down 
		// +ve x value--> right hand side, Y value -ve --> up 
		// -ve x value--> left hand side, Y value +ve --> down 
		// -ve x value--> left hand side, Y value -ve --> up 
		
		ba.executeScript("window.scrollBy(200,300)");
		Thread.sleep(200);
		ba.executeScript("window.scrollBy(30,45)");
		Thread.sleep(200);
		ba.executeScript("window.scrollBy(-30,-450)");
		
	}

}
