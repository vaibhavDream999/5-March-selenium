package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkedTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/mumbai");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Plays")).click();
	}

}
