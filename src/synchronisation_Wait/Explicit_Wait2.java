package synchronisation_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));//whenever we want explicit wait , then first done implicit function
		WebDriverWait rtr = new WebDriverWait(driver, Duration.ofMillis(4000));
		WebElement createAccount = driver.findElement(By.name("login"));
		
		rtr.until(ExpectedConditions.visibilityOf(createAccount));
		createAccount.click();
		
		WebElement ytdt = driver.findElement(By.name("pass"));
		ytdt.click();
		ytdt.sendKeys("4655675676");
	}

}
