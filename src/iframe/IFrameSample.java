package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// To find iframe
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// switch selenium to from main page to frame
		driver.switchTo().frame("iframe-name");
		Thread.sleep(100);
		// current focus is on frame
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();// this element is present in Iframe(need to switch selenium to from main page to frame)
		
		//to take action on main page again, we need to switch selenium focus from frame to main page
		//switchTo.parentframe();  Child frame to immediate parent
		//driver switch To default content (); 
		driver.switchTo().defaultContent();//switching selenium focus to main page

		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		
	}

}
