package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUse {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		//driver.findElement(By.xpath("//input[@value='Radio4']")).click();
		//driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
	}

}
