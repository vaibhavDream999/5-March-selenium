package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(3773);
		
		WebElement OTPButton= driver.findElement(By.xpath("(//button[text()='Get OTP']"));
		//boolean result = OTPButton.isEnabled();
		//System.out.println("OTP Button is "+result);
		
		driver.findElement(By.name("mobileNumber")).sendKeys("8888888888");
		Thread.sleep(1000);
		boolean result1 = OTPButton.isEnabled();
		System.out.println("OTPButton status is "+result1);
	}

}
