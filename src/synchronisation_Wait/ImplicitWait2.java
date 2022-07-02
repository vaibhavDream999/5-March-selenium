package synchronisation_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); syntax before selenium 4
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.name("login")).click();
		
		WebElement login = driver.findElement(By.name("email"));
		login.sendKeys("dbdfubf34@gmail.com");
	}

}
