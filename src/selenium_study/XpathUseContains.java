package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUseContains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(100);
		//Xpath by attribute
		driver.findElement(By.xpath("//input[@id='email']")).click();
		
		//Xpath by text()
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		//Xpath by Contains by text
		driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).click();
		
	
		
	}

}
