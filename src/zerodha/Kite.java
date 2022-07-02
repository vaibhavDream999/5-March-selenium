package zerodha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(300);
		driver.get("https://kite.zerodha.com/");
		
		WebElement username = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		username.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		loginButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		continueButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement userId = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualuserId = userId.getText();
		String expecteduserId = "ELR321";
		
		if(actualuserId.equals(expecteduserId)) 
		{
			System.out.println("UserId is matching and TC is passed");
		}
		else 
		{
			System.out.println("UserId is not matchng and TC is failed");
		}
		
		Thread.sleep(2000);
		userId.click();
		Thread.sleep(2000);
		WebElement logoutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		logoutButton.click();
		Thread.sleep(1000);
		driver.close();
	}

}
