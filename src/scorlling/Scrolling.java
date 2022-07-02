package scorlling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor jv = ((JavascriptExecutor)driver);
		// +ve x value--> right hand side, Y value +ve --> down 
		// +ve x value--> right hand side, Y value -ve --> up 
		// -ve x value--> left hand side, Y value +ve --> down 
		// -ve x value--> left hand side, Y value -ve --> up 
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		jv.executeScript("window.scrollBy(545,788)");
		Thread.sleep(2000);
		jv.executeScript("window.scrollBy(50,70)");
		Thread.sleep(2000);
		jv.executeScript("window.scrollBy(500,700)");
		Thread.sleep(2000);
		jv.executeScript("window.scrollBy(-500,-700)");
		Thread.sleep(2000);
		
	}

}
