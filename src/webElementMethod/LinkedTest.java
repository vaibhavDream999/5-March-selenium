package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Images")).click();
		
	}

}
