package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.edureka.co/blog/alerts-popups-in-selenium");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[@class='close'])[1]")).click();
		Thread.sleep(1000);
		
		
		// PROGRAM IS NOT RUN DUE TO (elementnot interactable exception)
	}

}
