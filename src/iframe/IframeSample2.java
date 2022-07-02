package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeSample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// switch selenium to from main page to frame
		driver.switchTo().frame("iframeResult");
		Thread.sleep(100);
		
		// current focus is on frame
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//to take action on main page again, we need to switch selenium focus from frame to main page
		//switchTo.parentframe();  Child frame to immediate parent
		//driver switch To default content (); 
		driver.switchTo().defaultContent();//switching selenium focus to main page
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();

		
	}

}

