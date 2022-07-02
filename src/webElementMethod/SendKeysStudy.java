package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("fffytyfviuiu");
		Thread.sleep(1266);
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		
		WebElement Username= driver.findElement(By.xpath("//input[@name='email']"));
		Username.sendKeys("353452");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("dhdjsjdgh");
		driver.findElement(By.xpath("//input[@name='pass']")).clear();
		
		WebElement Password= driver.findElement(By.xpath("//input[@name='pass']"));
		Password.sendKeys("4667346");
	}

}
