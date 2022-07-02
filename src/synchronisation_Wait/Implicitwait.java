package synchronisation_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); syntax before selenium 4
		

		// Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));// latest syntax after selenium 4
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
	}

}
