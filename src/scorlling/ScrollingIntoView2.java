package scorlling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingIntoView2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3200));
		WebElement crikplus = driver.findElement(By.id("cricbuzz-plus-main-menu"));
		
		JavascriptExecutor dhoni = ((JavascriptExecutor)driver);
		dhoni.executeScript("arguments[0].scrollIntoView(true);",crikplus);
		Thread.sleep(340);
		crikplus.click();
		
	}

}
