package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathuseTextContains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(100);
		//xpath by text.............
		driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).click();
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		
		//xpath by contains----// contains with text
		driver.findElement(By.xpath("//a[contains(text(), 'Velocity Corporate Training Center')]"));
	}

}
