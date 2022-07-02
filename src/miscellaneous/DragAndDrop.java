package miscellaneous;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		// 1. create objeect of actions class
		Actions asc= new Actions(driver);
		
		// 2. find out source point
		WebElement src = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		// 3. find out destination point
		WebElement destination = driver.findElement(By.id("amt8"));
			
			//i. 1st way to drag and drop
			//asc.dragAndDrop(src, destination).perform();
		
			//ii. 2nd way to drag and drop
			//asc.clickAndHold(src).doubleClick(destination).build().perform();
			
			//iii. 3rd way to drag and drop
			asc.clickAndHold(src).moveToElement(destination).release().build().perform();
	}
}
