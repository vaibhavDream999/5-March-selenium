package scorlling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingIntoView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2500));
		WebElement HideButton = driver.findElement(By.id("hide-textbox"));
		Thread.sleep(340);
		
		JavascriptExecutor ryur = ((JavascriptExecutor)driver);
		ryur.executeScript("arguments[0].scrollIntoView(true);",HideButton);
		Thread.sleep(340);
		HideButton.click();
	}

}
