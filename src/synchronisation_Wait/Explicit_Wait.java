package synchronisation_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		// Thread.sleep(1000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));// whenever we want explicit wait , then first done implicit function
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(2000));
		WebElement SignInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		
		//WebDriverWait wait= new WebDriverWait(driver, 30); old syntax
		
		w.until(ExpectedConditions.visibilityOf(SignInButton));
		SignInButton.click();
		 WebElement mn = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		mn.sendKeys("95659677659");
	}

}
