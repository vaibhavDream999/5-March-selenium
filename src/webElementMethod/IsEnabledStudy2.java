package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledStudy2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		
		WebElement OTPButton= driver.findElement(By.xpath("//a[text()='Log in']"));
		OTPButton.isEnabled();
		boolean Result = OTPButton.isEnabled();
		System.out.println(Result);
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234567890");
		Thread.sleep(4000);
		boolean Result1 = OTPButton.isEnabled();
		System.out.println(Result1);
	}

}
