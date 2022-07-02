package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		WebElement checkbox= driver.findElement(By.id("checkBoxOption1"));
		
		if(checkbox.isSelected()) 
		{
			System.out.println("checkbox is selected");
		}
		else 
		{
			System.out.println("checkbox is not selected");
		}
	}

}
