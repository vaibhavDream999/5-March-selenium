package miscellaneous;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		// Double click
		WebElement Myinfo = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions ac= new Actions(driver);
		
//		// 1st way to double click
//		ac.moveToElement(Myinfo).doubleClick().perform();
//		// 2nd way to double click
//		ac.doubleClick(Myinfo).perform();
		// 3rd way to right click
		ac.moveToElement(Myinfo).doubleClick().build().perform();
		
		// after double clicking perform alert popup[if applicable]
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

}
