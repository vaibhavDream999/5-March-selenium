package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Action = "Interface" and Actions = "class"
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//move to element using mouse actions
		Actions act= new Actions(driver);
		// for performing action , first we findout webelement
		WebElement Myelement = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		act.moveToElement(Myelement).perform();
		
		//click to element using mouse actions
		WebElement Myelement2 = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
//		// 1st way to find and click on action
//		act.moveToElement(Myelement2).perform();
//		act.click().perform();
//		// 2nd way to find and click on action
//		act.moveToElement(Myelement2).click().build().perform();
//		// 3rd way to find and click on action
//		act.click(Myelement2).perform();
		
		// right click to target--> context click()
//		// 1st way to right click
//		act.moveToElement(Myelement2).contextClick().build().perform();
//		// 2nd way to right click
//		act.contextClick(Myelement2).perform();
		// 3rd way to right click
		act.moveToElement(Myelement2).contextClick().perform();

	}

}
